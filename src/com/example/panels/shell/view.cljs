(ns com.example.panels.shell.view
  (:require [com.example.infra.helix :refer [defnc]]
            [com.example.infra.flex.hook :refer [use-flex]]
            [com.example.state :refer [state]]
            [helix.dom :as d]))

(defnc app-shell
  [_]
  (let [counter      (:counter state)
        counter-flex (use-flex counter)]
    (d/div
     {:class "container mx-auto flex flex-col items-center justify-center h-screen"}
     (d/h1
      {:class "p-4"}
      "Hello from Helix and Flex!")
     (d/h3
      {:class "p-4"}
      "Counter: " counter-flex)
     (d/button
      {:class "btn py-2 p-4"
       :onClick #(counter inc)}
      "Click me!"))))
