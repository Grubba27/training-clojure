(ns hello.tax.logic)



(defn blocked-in-source-tax
  "Returns the value that was blocked in the source based on this test 1000 > $ -> $ *.10 "
  [money]
  (let [max-money-value 1000
        retained-percentage 0.10]
    (cond
      (<= money 0) "err"
      (< money max-money-value) 0
      (>= money max-money-value) (* money retained-percentage))))
