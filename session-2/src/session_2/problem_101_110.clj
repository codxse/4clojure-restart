(ns session-2.problem-101-110)

;; 102 intoCamelCase
;; Medium

(defn p102 [s]
  (let [[x & y] (clojure.string/split s #"-")
        z (map clojure.string/capitalize y)]
    (apply str x z)))

(= (p102 "something") "something")

(= (p102 "multi-word-key") "multiWordKey")

(= (p102 "leaveMeAlone") "leaveMeAlone")

;; 105 Identify keys and values
;; Medium

(defn p105 [m]
  (let [p (->> (partition-by
                 #(when (keyword? %) (identity %))
                 m)
               (partition-all 2 1))]
    (into {} (for [[[k] v] p
                   :when (keyword? k)]
               [k (if (keyword? (first v)) [] v)]))))

(= {} (p105 []))

(= {:a [1]} (p105 [:a 1]))

(= {:a [1], :b [2]} (p105 [:a 1, :b 2]))

(= {:a [1 2 3], :b [], :c [4]} (p105 [:a 1 2 3 :b :c 4]))

;; 108 Lazy Searching
;; Medium

(defn p108 [& xs]
  (let [fst (map first xs)
        head (first fst)]
    (if (every? #(= head %) fst)
      head
      (let [sorted-list (sort-by first xs)]
        (apply p108 (cons (rest (first sorted-list)) (rest sorted-list)))))))

(= 3 (p108 [3 4 5]))

(= 4 (p108 [1 2 3 4 5 6 7] [0.5 3/2 4 19]))

(= 7 (p108 (range) (range 0 100 7/6) [2 3 5 7 11 13]))

(= 64 (p108 (map #(* % % %) (range)) ;; perfect cubes
          (filter #(zero? (bit-and % (dec %))) (range)) ;; powers of 2
          (iterate inc 20))) ;; at least as large as 20
