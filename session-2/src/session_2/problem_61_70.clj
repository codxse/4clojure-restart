(ns session-2.problem-61-70)

;; 69 Merge with a Function
;; Medium

(defn p69 [f & l]
  (->> (for [k (keys (apply merge l))]
         (let [[x & xs] (keep #(get % k) l)]
           (if xs
             [k (apply f x xs)]
             [k x])))
       (into {})))

(= (p69 * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5})
   {:a 4, :b 6, :c 20})

(= (p69 - {1 10, 2 20} {1 3, 2 10, 3 15})
   {1 7, 2 10, 3 15})

(= (p69 concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]})
   {:a [3 4 5], :b [6 7], :c [8 9]})
