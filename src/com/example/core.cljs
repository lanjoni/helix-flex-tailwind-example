(ns com.example.core
  (:require ["react-dom/client" :as rdom]
            [com.example.panels.shell.view :refer [app-shell]]
            [helix.core :refer [$]]))

(defonce root
  (rdom/createRoot (js/document.getElementById "app")))

(defn render []
  (.render root ($ app-shell)))

(defn ^:export init []
  (render))
