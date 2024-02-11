(ns test-case.core
  (:import java.util.Date)
  (:require [ring.adapter.jetty :as jetty]))

(def v [42 "foo" 99.2 [5 12]])

(def dest-map {:a 5 :b 6
               :c [7 8 9]
               :d {:e 10 :f 11}
               "foo" 88
               42 false})

(defn make-user
  [username & {:keys [email join-date]
               :or {join-date (java.util.Date.)}}]
  {:username username
   :join-date join-date
   :email email
   ;; 2.592e9 -> one month in ms
   :exp-date (java.util.Date. (long (+ 2.592e9 (.getTime join-date))))})

;;Variadic function
(def strange-adder (fn
                     ([x] (+ x 1))
                     ([x y] (+ x y))))

(defn average
  [numbers]
  (/ (apply + numbers) (count numbers)))

(defn list-quotation [x]
  (let [local-x 5]
      (local-x)))

(defn hypot [x y]
  (let [x-2 (* x x)
        y-2 (* y y)]
    (Math/sqrt (x-2 y-2))))

(def myapp [request]
  {:body "gello world!"
   :status 200
   :header {"Content-Type" "text/html"}})

(defn -main []
  (jetty/run-jetty test_case {:port 3000}))
>>>>>>> Stashed changes
