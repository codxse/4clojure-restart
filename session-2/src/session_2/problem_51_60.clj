(ns session-2.problem-51-60)

;; 60 Sequence Reductions
;; Medium

(defn p60
  ([f [x & xs]]
   (when (seq? xs)
     (lazy-seq (cons x (p60 f (cons (f x (first xs)) (rest xs)))))))
  ([f x xs]
   (cons x
     (when-let [[y & ys] (seq xs)]
       (lazy-seq (p60 f (f x y) ys))))))

(= (take 5 (p60 + (range))) [0 1 3 6 10])

(= (p60 conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])

(= (last (p60 * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)
