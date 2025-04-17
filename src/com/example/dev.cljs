(ns com.example.dev
  (:require [com.example.core :as core]
            [town.lilac.flex :as flex]))

(def state
  {:counter (flex/source 0)})

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn ^:dev/after-load reload []
  (prn "Reloading...")
  (core/init state))

(defn ^:export init []
  (core/init state))
