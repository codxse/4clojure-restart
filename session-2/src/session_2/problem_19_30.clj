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
