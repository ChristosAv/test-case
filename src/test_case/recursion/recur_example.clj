(ns test-case.recursion.recur-example)

(defn count-down
  []
  (loop [x 5]
    (if (zero? x)
      :blastoff!
      (do (println x)
          (recur (dec x))))))

(defn actual-count-down
  []
  (loop [x 5]
    (if (zero? x)
      :blastoff!
      (do (println x)
          (Thread/sleep 1000)
          (recur (dec x))))))
