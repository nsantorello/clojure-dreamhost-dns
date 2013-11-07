(defproject dreamhost-dns "0.1.0"
  :description "Clojure library for accessing Dreamhost's DNS API"
  :url "http://github.com/nsantorello/clojure-dreamhost-dns"
  :dependencies [[org.clojure/clojure "1.5.1"]
  				[org.clojure/data.json "0.2.3"]
  				[http-kit "2.1.12"]]
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :repl-options {:init-ns dreamhost-dns.core})
