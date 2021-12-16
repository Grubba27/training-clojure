(ns hello.fp.logic
  (:require [hello.core :refer :all]))

(defn big-hard-fn-price
  "Big hard function tax per department"
  [person-type]
  0.30)
(defn other-big-hard-fn-price
  "Big hard function tax per department"
  []
  0.50)
;; RH problem

;; treinando o if e começando a calular um sistema de pagamento de RH
(defn salary-imposts
  "Returns the amount of imposts that should be paid based on worker salary follows the rule:
   <= 1000 -> 0
   < 2000 -> 10%
   ** ->  20%"
  [salary high-custom-impost mid-cost-fn]
  (let [no-imposts 0
        mid-imposts (mid-cost-fn)
        high-imposts high-custom-impost
        minimum-wage 1000
        impost-start-wage 2000]
    (if (<= salary minimum-wage)
      (* salary no-imposts)
      (if (< salary impost-start-wage)
        (* salary mid-imposts)
        (* salary high-imposts)))))

(salary-imposts 4000 (big-hard-fn-price "CEO") other-big-hard-fn-price)