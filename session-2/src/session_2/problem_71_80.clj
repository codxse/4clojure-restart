(ns session-2.problem-71-80)

;; 75 Euler's Totient Function
;; Medium

(defn p75 [x]
  (case x 1 1
    (count (filter #(= 1 ((fn [a b]
                            (if (zero? a)
                              b
                              (recur (rem b a) a))) x %))
                   (range 1 x)))))

(= (p75 1) 1)

(= (p75 10) (count '(1 3 7 9)) 4)

(= (p75 40) 16)

(= (p75 99) 60)

;; 77 Anagram Finder
;; Medium

(defn p77 [ws]
  (->> (mapcat #(do {% (sort %)}) ws)
       (group-by #(second %))
       (vals)
       (map (fn [x] (set (map first x))))
       (filter #(> (count %) 1))
       (into #{})))

(= (p77 ["meat" "mat" "team" "mate" "eat"])
   #{#{"meat" "team" "mate"}})

(= (p77 ["veer" "lake" "item" "kale" "mite" "ever"])
   #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}})
