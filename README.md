# clojure-dreamhost-dns

A Clojure library designed for accessing Dreamhost's DNS API.

## Usage

Listing DNS records
`(dns-list-records "MY_API_KEY")`

Adding a DNS record
`(dns-add-record "MY_API_KEY" "A" "test.example.com" "127.0.0.1" "added via api")`

Removing a DNS record
`(dns-remove-record "MY_API_KEY" "A" "test.example.com" "127.0.0.1")`