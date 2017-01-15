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