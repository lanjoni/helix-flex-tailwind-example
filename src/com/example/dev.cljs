(ns com.example.dev
  (:require [helix.experimental.refresh :as r]))

(r/inject-hook!)

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn ^:dev/after-load reload []
  (prn "Reloading...")
  (r/refresh!))
