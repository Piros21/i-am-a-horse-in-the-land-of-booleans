(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean
  "evaluates if a value is boolean or not"
  [x]
  (if x true false))

(defn abs
  "returns the absolute value of a given number"
  [n]
  (if (> n 0)
    n
    (* n -1)))

(defn divides?
  "returns true if divisor is divisible with n and false otherwise"
  [divisor n]
  (if (== divisor 0)
    "error: dividing by zero"
    (if (== (mod n divisor) 0)
      true
      false
      )
  ))

(defn fizzbuzz
  "Return fizz when n is divisible by 3
   buzz when n is divisible by 5
   gotcha! when n is divisible by 15
   and empty string otherwise"
  [n]
  (cond
    (== (mod n 15) 0) "gotcha!"
    (== (mod n 3) 0)  "fizz"
    (== (mod n 5) 0)  "buzz"
    :else ""
  )
)

(defn teen? [age]
  "return true if age is min 13 and max 19"
  (<= 13 age 19))

(defn not-teen?
  "Returns true if teen? returns false
   and false if teen? returns true"
  [age]
  (not (teen? age))
  )

(defn generic-doublificate
  "if x number returns dobule of x
   if x an empty collection returns nil
   if x is a list or vector returns twice its length
   and true otherwise"
  [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true
    )
  )

(defn leap-year?
  "returns true if year is a leap year
   false otherwise"
  [year]
  (cond
    (== (mod year 400) 0) true
    (and (== (mod year 4) 0) (not (== (mod year 100) 0))) true
    :else false
  )
)

; '_______'
