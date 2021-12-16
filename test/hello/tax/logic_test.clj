(ns hello.tax.logic-test
  (:require [clojure.test :refer :all]
            [hello.tax.logic :refer [blocked-in-source-tax]]))



(deftest blocked-in-source-tax-min-test
  (testing "Given an input lower than 1000 it should return 0"
    (is (= 0 (blocked-in-source-tax 999)))
    (is (= 0 (blocked-in-source-tax 1)))))

(deftest blocked-in-source-tax-max-test
  (testing "Given an input bigger than 1000 it should return 10%"
    (is (= 100 (blocked-in-source-tax 1000)))
    (is (= 210 (blocked-in-source-tax 2100)))))