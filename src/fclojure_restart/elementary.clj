(ns fclojure-restart.elementary)

;; Problem 1
;; Elementary
;; Nothing but the Truth

(defn no1
  [x]
  (= true x))

;; Problem 2
;; Elementary
;; Simple Math

(defn no2
  [x]
  (= (- 10 (* 2 3)) x))

;; Problem 3
;; Elementary
;; Intro to Strings

(defn no3
  [x]
  (= x (.toUpperCase "hello world")))

;; Problem 4
;; Elementary
;; Intro to Lists

(defn no4
  [& args]
  into '() args)

;; Problem 5
;; Elementary
;; List: conj

(defn no5
  [& args]
  (= (lazy-seq args) (or (conj '(2 3 4) 1) (conj '(3 4) 2 1))))

;; Problem 6
;; Elementary
;; Intro to Vectors

(defn no6
  [& args]
  (= (into [] args) (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)))

;; Problem 7
;; Elementary
;; Vectors: conj

(defn no7
  [& args]
  (= (into [] args) (or (conj [1 2 3] 4) (conj [1 2] 3 4))))