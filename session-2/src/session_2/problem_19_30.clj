(ns session-2.problem-19-30)

;; 19 - Easy
(defn p19 [c]
  (-> c reverse first))

(= (p19 [1 2 3 4 5]) 5)
(= (p19 '(5 4 3)) 3)
(= (p19 ["b" "c" "d"]) "d")

;; 20 - Easy 
(defn p20 [c]
  (-> c reverse second))

(= (p20 (list 1 2 3 4 5)) 4)
(= (p20 ["a" "b" "c"]) "b")
(= (p20 [[1 2] [3 4]]) [1 2])

;; 21 - Easy
(defn p21 [coll x]
  ((vec coll) x))

(= (p21 '(4 5 6 7) 2) 6)
(= (p21 [:a :b :c] 0) :a)
(= (p21 [1 2 3 4] 1) 2)
(= (p21 '([1 2] [3 4] [5 6]) 2) [5 6])

;; 22 - Easy
(defn p22 [coll]
  (reduce + (map #(identity %2) coll (repeat 1))))

(= (p22 '(1 2 3 3 1)) 5)
(= (p22 "Hello World") 11)
(= (p22 [[1 2] [3 4] [5 6]]) 3)
(= (p22 '(13)) 1)
(= (p22 '(:a :b :c)) 3)

;; 23 - Easy
(defn p23 [coll]
  (into '() coll))

(= (p23 [1 2 3 4 5]) [5 4 3 2 1])
(= (p23 (sorted-set 5 7 2 7)) '(7 5 2))
(= (p23 [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

;; 24 - Easy
(defn p24 [coll]
  (reduce + coll))

(= (p24 [1 2 3]) 6)
(= (p24 (list 0 -2 5 5)) 8)

;; 25 - Easy
(defn p25 [coll]
  (filter odd? coll))

(= (p25 #{1 2 3 4 5}) '(1 3 5))
(= (p25 [4 2 1 6]) '(1))
(= (p25 [2 2 4 6]) '())
(= (p25 [1 1 1 3]) '(1 1 1 3))

;; 26 - Easy
(defn p26-h
  ([] (p26-h 1 1))
  ([x y] (lazy-seq (cons x (p26-h y (+ x y))))))

(defn p26 [n]
  (take n (p26-h)))

(= (p26 3) '(1 1 2))
(= (p26 6) '(1 1 2 3 5 8))
(= (p26 8) '(1 1 2 3 5 8 13 21))

;; 27 - Easy
(defn p27 [c]
  (= (seq c) (reverse c)))

(false? (p27 '(1 2 3 4 5)))
(true? (p27 "racecar"))
(true? (p27 [:foo :bar :foo]))
(true? (p27 '(1 1 3 3 1 1)))
(false? (p27 '(:a :b :c)))

;; 28 - Easy
(defn p28 [c]
  (if (coll? c)
    (mapcat p28 c)
    [c]))

(= (p28 '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
(= (p28 ["a" ["b"] "c"]) '("a" "b" "c"))
(= (p28 '((((:a))))) '(:a))


;; 29 - Easy
(defn p29
  [s]
  (let [cap "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        cap? #(some (partial = %) cap)
        in (seq s)]
    (apply str (filter cap? in))))

(= (p29 "HeLlO, WoRlD!") "HLOWRD")
(empty? (p29 "nothing"))
(= (p29 "$#A(*&987Zf") "AZ")

;; 30 - Easy
(defn p30
  [c]
  (map first (partition-by identity c)))

(= (apply str (p30 "Leeeeeerrroyyy")) "Leroy")
(= (p30 [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
(= (p30 [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))