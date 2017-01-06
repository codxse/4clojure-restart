(ns four-clojure.sandbox)

(defn square [x]
  (* x x))

(defn dsequare [x]
  (* (square x) 2))

(pairwise-disj #{#{\U} #{\s} #{\e \R \E} #{\P \L} #{\.}})

(pairwise-disj #{#{'(:x :y :z) '(:x :y) '(:z) '()}
                 #{#{:x :y :z} #{:x :y} #{:z} #{}}
                 #{'[:x :y :z] [:x :y] [:z] [] {}}}) 

(def junk {:content {:element "Air Tanah Udara" 
                     :future "Fire" 
                     :dark "Nation and Moon"}})

(map #(vector :h1 (val %)) (junk :content))

(def world {:nation 100
            :province 50
            :precident 122})

(def indo {:bawang "putih"
           :cabe "merah"
           :apel "malang"})



