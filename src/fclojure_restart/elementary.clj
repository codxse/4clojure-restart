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
  [x]
  (= x (or (conj '(2 3 4) 1) (conj '(3 4) 2 1))))
