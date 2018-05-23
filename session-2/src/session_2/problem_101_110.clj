(ns session-2.problem-101-110)

;; 102 intoCamelCase
;; Medium

(defn p102 [s]
  (let [[x & y] (clojure.string/split s #"-")
        z (map clojure.string/capitalize y)]
    (apply str x z)))

(= (p102 "something") "something")

(= (p102 "multi-word-key") "multiWordKey")

(= (p102 "leaveMeAlone") "leaveMeAlone")
