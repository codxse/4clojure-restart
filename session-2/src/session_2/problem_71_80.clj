(ns session-2.problem-71-80)

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
