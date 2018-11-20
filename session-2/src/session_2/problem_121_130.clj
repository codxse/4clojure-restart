(ns session-2.problem-121-130)

;; 128 Recognize Playing Cards
;; Easy

(defn p128 [[s t]]
  (let [f (zipmap "23456789TJQKADHCS"
                  (conj (vec (range 13)) :diamond :heart :club :spades))]
    {:suit (f s)
     :rank (f t)}))

(= {:suit :diamond :rank 10} (p128 "DQ"))

(= {:suit :heart :rank 3} (p128 "H5"))

(= {:suit :club :rank 12} (p128 "CA"))

(= (range 13) (map (comp :rank p128 str)
                   '[S2 S3 S4 S5 S6 S7
                     S8 S9 ST SJ SQ SK SA]))