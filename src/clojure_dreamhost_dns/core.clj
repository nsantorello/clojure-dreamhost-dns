(ns clojure-dreamhost-dns.core
	(require 
		[clojure.data.json :as json]
		[org.httpkit.client :as http]))

(defn uuid [] (str (java.util.UUID/randomUUID)))

(defn format-api-args [args] (reduce (fn [acc kvp] (str acc "&" (key kvp) "=" (val kvp))) "" args))

(defn api-call [api-key cmd args]
	(let [response (http/get (str "https://api.dreamhost.com/?key=" api-key 
		"&unique_id=" (uuid) "&cmd=" cmd "&format=json"	(format-api-args args)) {:as :text})]
		(json/read-str (:body @response))))

(defn dns-list-records [api-key]
	(api-call api-key "dns-list_records" {}))

(defn dns-add-record [api-key type record value comment]
	(api-call api-key "dns-add_record" {'record record, 'type type, 
		'value value, 'comment (http/url-encode comment)}))

(defn dns-remove-record [api-key type record value]
	(api-call api-key "dns-remove_record" {'record record, 
		'type type, 'value value}))