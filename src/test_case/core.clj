(ns test-case.core
  (:gen-class))

(def v [42 "foo" 99.2 [5 12]])

(defn average
  [numbers]
  (/ (apply + numbers) (count numbers)))

(defn list-quotation [& x]
  (prn '(x)))

(defn hypot [x y]
  (let [x-2 (* x x)
        y-2 (* y y)]
    (Math/sqrt (x-2 y-2))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
