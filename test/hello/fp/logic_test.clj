(ns hello.fp.logic-test
  (:require [clojure.test :refer :all]
            [hello.fp.logic :refer :all]))

(deftest big-hard-fn-price-test
  (testing "Given an input of person should return price"
    (is (= 0.30 (big-hard-fn-price "CEO")))))

(deftest salary-imposts-test
  (testing "Given an input of CEO salary should return imposts"
    (is (= 1200.0 (salary-imposts 4000 (big-hard-fn-price "CEO") other-big-hard-fn-price )))))


(deftest salary-imposts-test
  (testing "Given an input of tec salary should return imposts"
    (is (= 600.0 (salary-imposts 2000 (big-hard-fn-price "tech") other-big-hard-fn-price )))))