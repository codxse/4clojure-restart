(ns session-2.problem-1-18)

;; 1 - Elementary
(= true true)

;; 2 - Elementary
(= (- 10 (* 2 3)) 4)

;; 3 - Elementary
(= "HELLO WORLD" (.toUpperCase "hello world"))

;; 4 - Elementary
(= (list :a :b :c) '(:a :b :c))

;; 5 - Elementary
(= '(1 2 3 4) (conj '(2 3 4) 1))

;; 6 - Elementary
(= [:a :b :c]
   (list :a :b :c)
   (vec '(:a :b :c))
   (vector :a :b :c))

;; 7 - Elementary
(= [1 2 3 4] (conj [1 2 3] 4))

;; 8 - Elementary
(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d)))
(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}))

;; 9 - Elementary
(= #{1 2 3 4} (conj #{1 4 3} 2))

;; 10 - Elementary
(= 20 ((hash-map :a 10, :b 20, :c 30) :b))
(= 20 (:b {:a 10, :b 20, :c 30}))

;; 11 - Elementary
(= {:a 1, :b 2, :c 3} (conj {:a 1} {:b 2} [:c 3]))

;; 12 - Elementary
(= 3 (first '(3 2 1)))
(= 3 (second [2 3 4]))
(= 3 (last (list 1 2 3)))

;; 13 - Elementary
(= [20 30 40] (rest [10 20 30 40]))

;; 14 - Elementary
(= 8 ((fn add-five [x] (+ x 5)) 3))
(= 8 ((fn [x] (+ x 5)) 3))
(= 8 (#(+ % 5) 3))
(= 8 ((partial + 5) 3))

;; 15 - Elementary
(defn p15 [x]
   (* 2 x))

(= (p15 2) 4)
(= (p15 3) 6)
(= (p15 11) 22)
(= (p15 7) 14)

;; 16 - Elementary
(defn p16 [x]
   (str "Hello, " x "!"))

(= (p16 "Dave") "Hello, Dave!")
(= (p16 "Jenn") "Hello, Jenn!")
(= (p16 "Rhea") "Hello, Rhea!")

;; 17 - Elementary
(= [6 7 8] (map #(+ % 5) '(1 2 3)))

;; 18 - Elementary
(= [6 7] (filter #(> % 5) '(3 4 5 6 7)))