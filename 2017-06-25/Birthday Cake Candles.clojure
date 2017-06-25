(use '[clojure.string :only (split triml)])

(
        let [
          n_t (read-line) 
          n (Integer/parseInt n_t) 
        ]

      (
        let [
          ar_temp (read-line) 
          ar_t (split ar_temp #"\s+") 
          ar (map #(Integer/parseInt %) ar_t) 
          max_value (apply max ar)
          result (count (filter (fn [x] (= x max_value)) ar))
        ]
        (print result)
      )

)
