(ns hello.core)
;; primeira função com let
(defn valor-conta
  "Define o valor total da conta com os 10% do atendente"
  [valor]
  (let [percento-do-funcionario 0.1
        valor-adicional (* valor percento-do-funcionario)]
    (+ valor valor-adicional)))

;; treinando o if e começando a calular um sistema de pagamento de RH
(defn salary-imposts
  "Returns the amount of imposts that should be paid based on worker salary follows the rule:
   <= 1000 -> 0
   < 2000 -> 10%
   ** ->  20%"
  [salary]
  (let [no-imposts 0
        mid-imposts 0.1
        high-imposts 0.2
        minimum-wage 1000
        impost-start-wage 2000]
    (if (<= salary minimum-wage)
      (* salary no-imposts)
      (if (< salary impost-start-wage)
        (* salary mid-imposts)
        (* salary high-imposts)))))


;; started tdd
;; Fully tested function
(defn delivery-tax
  "Calculate the price of the delivery tax based on input based on this table:
   80 => $ -> 15
   80  < $ > 250 -> 5
   $ >=  250  -> 0"
  [final-items-value]
  (let [free-tax 0
        mid-tax 5
        max-tax 15
        min-price-limit 80
        max-price-limit 250
        ]
    (cond
      (<= final-items-value 0) "err"
      (<= final-items-value min-price-limit) max-tax
      (and (> final-items-value min-price-limit) (< final-items-value max-price-limit)) mid-tax
      (>= final-items-value max-price-limit) free-tax
      )))



(defn -main [] (println (salary-imposts 1900)))