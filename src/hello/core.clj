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

(defn -main [] (println (salary-imposts 1900)))