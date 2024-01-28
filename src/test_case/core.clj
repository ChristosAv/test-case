(ns test-case.core
  (:gen-class))

(defn average
  [numbers]
  (prn (/ (apply + numbers) (count numbers))))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

