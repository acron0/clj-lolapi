(defproject clj-lolapi "0.1.0-SNAPSHOT"
  :description "A Clojure interface to Riot Games's League of Legends API."
  :url "https://github.com/maxnoel/clj-lolapi"
  :license {:name "LGPL v3"
            :url "http://www.gnu.org/licenses/lgpl.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-http "2.0.0"]
                 ;; http://stackoverflow.com/questions/32131712/clj-http-get-url-as-json-doesnt-work-in-script-but-in-repl
                 [cheshire "5.5.0"]
                 [environ "1.0.1"]])
