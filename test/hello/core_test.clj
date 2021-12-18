(ns hello.core-test
  (:require [clojure.test :refer :all]
            [hello.core :refer :all]))




(deftest tax-below-80-test
  (testing "Given an input of 80 it should return 15"
    (is (= 15 (delivery-tax 1)))
    (is (= 15 (delivery-tax 80)))))


(deftest tax-between-80-and-250-test
  (testing "Given an input of 85 0r 249 it should return 5"
    (is (= 5 (delivery-tax 85)))
    (is (= 5 (delivery-tax 249)))))


(deftest tax-bigger-than-250-test
  (testing "Given an input bigger than 250 it should return 0"
    (is (= 0 (delivery-tax 250)))
    (is (= 0 (delivery-tax 300)))))

(deftest get-json-property-value-test
  (testing "Given an input of array it should return the value of its property"
    (is (= "a" (get-value-of-json-string ["test" "a" "test2" "c"] "test")))
    (is (= "c" (get-value-of-json-string ["test" "a" "test2" "c"] "test2")))))


(deftest get-wrong-property-value-test
  (testing "Given an wrong input of array it should return the value of its property"
    (is (= nil (get-value-of-json-string ["test" "a" "test2" "c"] "test3")))))