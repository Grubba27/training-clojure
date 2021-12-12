(ns hello.core)

;; primeira função com let
(defn valor-conta
  "Define o valor total da conta com os 10% do atendente"
  [valor]
  (let [percento-do-funcionario 0.1
        valor-adicional (* valor percento-do-funcionario)]
    (+ valor valor-adicional)))

(defn -main [] (println (valor-conta 1000)))