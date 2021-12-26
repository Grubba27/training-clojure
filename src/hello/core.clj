(ns hello.core)

;; primeira função com let
(defn valor-conta
  "Define o valor total da conta com os 10% do atendente"
  [valor]
  (let [percento-do-funcionario 0.1
        valor-adicional (* valor percento-do-funcionario)]
    (+ valor valor-adicional)))



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
      (>= final-items-value max-price-limit) free-tax)))

;; Get unique type of clojure [] are also diferent  atoms
(type (/ 10 3))
;; Descoverying macros
(defmacro my-first-macro
  "My first macro for just testing sum of numbers in array"
  [item]
  (reduce + item))

(defn somar
  "Recebe dois valores como parametro e retorna o resultado da soma"
  [a b]
  (+ a b))

(defn get-value-of-json-string
  "given and json and the name of property it returns its value"
  [json property]
  (if (= (json 0) (json (+ 1 (.indexOf json property))))
    nil
    (json (+ 1 (.indexOf json property)))))