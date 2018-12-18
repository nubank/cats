(defproject nubank/cats "2.4.3-SNAPSHOT"
  :description "Category Theory abstractions for Clojure"
  :url         "https://github.com/funcool/cats"
  :license {:name "BSD (2 Clause)"
            :url  "http://opensource.org/licenses/BSD-2-Clause"}
  :dependencies [[org.clojure/clojure "1.9.0" :scope "provided"]
                 [org.clojure/clojurescript "1.9.946" :scope "provided"]
                 [org.clojure/core.async "0.4.474" :scope "provided"]
                 [org.clojure/test.check "0.9.0" :scope "provided"]
                 [org.clojure/core.match "0.3.0-alpha4" :scope "provided"]
                 [manifold "0.1.6" :scope "provided"]
                 [funcool/promesa "1.9.0" :scope "provided"]]
  :repositories [["nu-maven" {:url "s3p://nu-maven/releases/" :snapshots false}]]
  :deploy-repositories [["releases" {:url "s3p://nu-maven/releases/" :no-auth true}]]
  :plugins [[s3-wagon-private "1.3.1"]]
  :source-paths   ["src"]
  :test-paths     ["test"]
  :jar-exclusions [#"\.swp|\.swo|user\.clj"])
