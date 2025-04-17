(ns com.example.core
  (:require ["react-dom/client" :as rdom]
            [com.example.panels.shell.view :refer [app-shell]]
            [helix.core :refer [$]]))

(defonce root
  (rdom/createRoot (js/document.getElementById "app")))

(defn render [{:keys [counter]}]
  (.render root ($ app-shell {:counter counter})))

(defn ^:export init [state]
  (render state))
