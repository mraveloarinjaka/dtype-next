(ns tech.v3.datatype.functional
  ;;Autogenerated from tech.v3.datatype.functional-api-- DO NOT EDIT
  "Arithmetic and statistical operations based on the Buffer interface.  These
  operators and functions all implement vectorized interfaces so passing in something
  convertible to a reader will return a reader.  Arithmetic operations are done lazily.
  These functions generally incur a large dispatch cost so for example each call to '+'
  checks all the arguments to decide if it should dispatch to an iterable implementation
  or to a reader implementation.  For tight loops or operations like map and filter,
  using the specific operators will result in far faster code than using the '+'
  function itself."
  (:require [tech.v3.datatype.functional-api]
            [tech.v3.datatype.rolling]
            [tech.v3.datatype.statistics]
            [tech.v3.datatype.unary-pred])
  (:refer-clojure :exclude [+ - / * <= < >= > identity min max bit-xor bit-and bit-and-not bit-not bit-set bit-test bit-or bit-flip bit-clear bit-shift-left bit-shift-right unsigned-bit-shift-right quot rem cast not and or neg? even? zero? odd? pos? abs finite? infinite?]))

(defn *
  ([x y]
  (tech.v3.datatype.functional-api/* x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/* x y args)))


(defn +
  ([x]
  (tech.v3.datatype.functional-api/+ x))
  ([x y]
  (tech.v3.datatype.functional-api/+ x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/+ x y args)))


(defn -
  ([x]
  (tech.v3.datatype.functional-api/- x))
  ([x y]
  (tech.v3.datatype.functional-api/- x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/- x y args)))


(defn ->CumOpConsumer
  "Positional factory function for class tech.v3.datatype.functional_api.CumOpConsumer."
  ([op sum first p result]
  (tech.v3.datatype.functional-api/->CumOpConsumer op sum first p result)))


(defn /
  ([x]
  (tech.v3.datatype.functional-api// x))
  ([x y]
  (tech.v3.datatype.functional-api// x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api// x y args)))


(defn <
  ([x y z]
  (tech.v3.datatype.functional-api/< x y z))
  ([x y]
  (tech.v3.datatype.functional-api/< x y)))


(defn <=
  ([x y z]
  (tech.v3.datatype.functional-api/<= x y z))
  ([x y]
  (tech.v3.datatype.functional-api/<= x y)))


(defn >
  ([x y z]
  (tech.v3.datatype.functional-api/> x y z))
  ([x y]
  (tech.v3.datatype.functional-api/> x y)))


(defn >=
  ([x y z]
  (tech.v3.datatype.functional-api/>= x y z))
  ([x y]
  (tech.v3.datatype.functional-api/>= x y)))


(defn abs
  ([x options]
  (tech.v3.datatype.functional-api/abs x options))
  ([x]
  (tech.v3.datatype.functional-api/abs x)))


(defn acos
  ([x options]
  (tech.v3.datatype.functional-api/acos x options))
  ([x]
  (tech.v3.datatype.functional-api/acos x)))


(defn and
  ([x y]
  (tech.v3.datatype.functional-api/and x y)))


(defn asin
  ([x options]
  (tech.v3.datatype.functional-api/asin x options))
  ([x]
  (tech.v3.datatype.functional-api/asin x)))


(defn atan
  ([x options]
  (tech.v3.datatype.functional-api/atan x options))
  ([x]
  (tech.v3.datatype.functional-api/atan x)))


(defn atan2
  ([x y]
  (tech.v3.datatype.functional-api/atan2 x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/atan2 x y args)))


(defn bit-and
  ([x y]
  (tech.v3.datatype.functional-api/bit-and x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-and x y args)))


(defn bit-and-not
  ([x y]
  (tech.v3.datatype.functional-api/bit-and-not x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-and-not x y args)))


(defn bit-clear
  ([x y]
  (tech.v3.datatype.functional-api/bit-clear x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-clear x y args)))


(defn bit-flip
  ([x y]
  (tech.v3.datatype.functional-api/bit-flip x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-flip x y args)))


(defn bit-not
  ([x options]
  (tech.v3.datatype.functional-api/bit-not x options))
  ([x]
  (tech.v3.datatype.functional-api/bit-not x)))


(defn bit-or
  ([x y]
  (tech.v3.datatype.functional-api/bit-or x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-or x y args)))


(defn bit-set
  ([x y]
  (tech.v3.datatype.functional-api/bit-set x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-set x y args)))


(defn bit-shift-left
  ([x y]
  (tech.v3.datatype.functional-api/bit-shift-left x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-shift-left x y args)))


(defn bit-shift-right
  ([x y]
  (tech.v3.datatype.functional-api/bit-shift-right x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-shift-right x y args)))


(defn bit-test
  ([x y]
  (tech.v3.datatype.functional-api/bit-test x y)))


(defn bit-xor
  ([x y]
  (tech.v3.datatype.functional-api/bit-xor x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/bit-xor x y args)))


(defn bool-reader->indexes
  "Given a reader, produce a filtered list of indexes filtering out 'false' values."
  (^{:tag tech.v3.datatype.Buffer} [options x]
  (tech.v3.datatype.unary-pred/bool-reader->indexes options x))
  (^{:tag tech.v3.datatype.Buffer} [x]
  (tech.v3.datatype.unary-pred/bool-reader->indexes x)))


(defn cbrt
  ([x options]
  (tech.v3.datatype.functional-api/cbrt x options))
  ([x]
  (tech.v3.datatype.functional-api/cbrt x)))


(defn ceil
  ([x options]
  (tech.v3.datatype.functional-api/ceil x options))
  ([x]
  (tech.v3.datatype.functional-api/ceil x)))


(defn cos
  ([x options]
  (tech.v3.datatype.functional-api/cos x options))
  ([x]
  (tech.v3.datatype.functional-api/cos x)))


(defn cosh
  ([x options]
  (tech.v3.datatype.functional-api/cosh x options))
  ([x]
  (tech.v3.datatype.functional-api/cosh x)))


(defn cummax
  "Cumulative running max; returns result in double space.

  Options:

  * `:nan-strategy` - one of `:keep`, `:remove`, `:exception`.  Defaults to `:remove`."
  ([x options]
  (tech.v3.datatype.functional-api/cummax x options))
  ([x]
  (tech.v3.datatype.functional-api/cummax x)))


(defn cummin
  "Cumulative running min; returns result in double space.

  Options:

  * `:nan-strategy` - one of `:keep`, `:remove`, `:exception`.  Defaults to `:remove`."
  ([x options]
  (tech.v3.datatype.functional-api/cummin x options))
  ([x]
  (tech.v3.datatype.functional-api/cummin x)))


(defn cumprod
  "Cumulative running product; returns result in double space.

  Options:

  * `:nan-strategy` - one of `:keep`, `:remove`, `:exception`.  Defaults to `:remove`."
  ([x options]
  (tech.v3.datatype.functional-api/cumprod x options))
  ([x]
  (tech.v3.datatype.functional-api/cumprod x)))


(defn cumsum
  "Cumulative running summation; returns result in double space.

  Options:

  * `:nan-strategy` - one of `:keep`, `:remove`, `:exception`.  Defaults to `:remove`."
  ([x options]
  (tech.v3.datatype.functional-api/cumsum x options))
  ([x]
  (tech.v3.datatype.functional-api/cumsum x)))


(defn descriptive-statistics
  "Calculate a set of descriptive statistics on a single reader.

  Available stats:
  #{:min :quartile-1 :sum :mean :mode :median :quartile-3 :max
    :variance :standard-deviation :skew :n-elems :kurtosis}

  options
    - `:nan-strategy` - defaults to :remove, one of
    [:keep :remove :exception]. The fastest option is :keep but this
    may result in your results having NaN's in them.  You can also pass
  in a double predicate to filter custom double values."
  ([stats-names stats-data options x]
  (tech.v3.datatype.statistics/descriptive-statistics stats-names stats-data options x))
  ([stats-names options rdr]
  (tech.v3.datatype.statistics/descriptive-statistics stats-names options rdr))
  ([stats-names rdr]
  (tech.v3.datatype.statistics/descriptive-statistics stats-names rdr))
  ([rdr]
  (tech.v3.datatype.statistics/descriptive-statistics rdr)))


(defn distance
  (^{:tag double} [x y]
  (tech.v3.datatype.functional-api/distance x y)))


(defn distance-squared
  (^{:tag double} [x y]
  (tech.v3.datatype.functional-api/distance-squared x y)))


(defn dot-product
  (^{:tag double} [x y]
  (tech.v3.datatype.functional-api/dot-product x y)))


(defn eq
  ([x y]
  (tech.v3.datatype.functional-api/eq x y)))


(defn equals
  ([x y & args]
  (apply tech.v3.datatype.functional-api/equals x y args)))


(defn even?
  ([x options]
  (tech.v3.datatype.functional-api/even? x options))
  ([x]
  (tech.v3.datatype.functional-api/even? x)))


(defn exp
  ([x options]
  (tech.v3.datatype.functional-api/exp x options))
  ([x]
  (tech.v3.datatype.functional-api/exp x)))


(defn expm1
  ([x options]
  (tech.v3.datatype.functional-api/expm1 x options))
  ([x]
  (tech.v3.datatype.functional-api/expm1 x)))


(defn fill-range
  "Given a reader of numeric data and a max span amount, produce
  a new reader where the difference between any two consecutive elements
  is less than or equal to the max span amount.  Also return a bitmap of the added
  indexes.  Uses linear interpolation to fill in areas, operates in double space.
  Returns
  {:result :missing}"
  ([x max-span]
  (tech.v3.datatype.functional-api/fill-range x max-span)))


(defn finite?
  ([x options]
  (tech.v3.datatype.functional-api/finite? x options))
  ([x]
  (tech.v3.datatype.functional-api/finite? x)))


(defn fixed-rolling-window
  "Return a lazily evaluated rolling window of window-fn applied to each window.  The
  iterable or sequence is padded such that there are the same number of values in the
  result as in the input with repeated elements padding the beginning and end of the original
  sequence.
  If input is an iterator, output is an lazy sequence.  If input is a reader,
  output is a reader.

  :Options

  * `:relative-window-position` - Defaults to `:center` - controls the window's
  relative positioning in the sequence.
  * `:edge-mode` - Defaults to `:clamp` - either `:zero` in which case window values
  off the edge are zero for numeric types or nil for object types or `:clamp` - in
  which case window values off the edge of the data are bound to the first or last
  values respectively.


  Example (all results are same length):

```clojure
user> (require '[tech.v3.datatype :as dtype])
nil
user> (require '[tech.v3.datatype.rolling :as rolling])
nil
user> (require '[tech.v3.datatype.functional :as dfn])
nil
  user> (rolling/fixed-rolling-window (range 20) 5 dfn/sum {:relative-window-position :left})
[0 1 3 6 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85]
user> (rolling/fixed-rolling-window (range 20) 5 dfn/sum {:relative-window-position :center})
[3 6 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 89 92]
user> (rolling/fixed-rolling-window (range 20) 5 dfn/sum {:relative-window-position :right})
[10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 89 92 94 95]
user>
```"
  ([x window-size window-fn options]
  (tech.v3.datatype.rolling/fixed-rolling-window x window-size window-fn options))
  ([x window-size window-fn]
  (tech.v3.datatype.rolling/fixed-rolling-window x window-size window-fn)))


(defn floor
  ([x options]
  (tech.v3.datatype.functional-api/floor x options))
  ([x]
  (tech.v3.datatype.functional-api/floor x)))


(defn get-significand
  ([x options]
  (tech.v3.datatype.functional-api/get-significand x options))
  ([x]
  (tech.v3.datatype.functional-api/get-significand x)))


(defn hypot
  ([x y]
  (tech.v3.datatype.functional-api/hypot x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/hypot x y args)))


(defn identity
  ([x options]
  (tech.v3.datatype.functional-api/identity x options))
  ([x]
  (tech.v3.datatype.functional-api/identity x)))


(defn ieee-remainder
  ([x y]
  (tech.v3.datatype.functional-api/ieee-remainder x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/ieee-remainder x y args)))


(defn infinite?
  ([x options]
  (tech.v3.datatype.functional-api/infinite? x options))
  ([x]
  (tech.v3.datatype.functional-api/infinite? x)))


(defn kendalls-correlation
  (^{:tag double} [options x y]
  (tech.v3.datatype.statistics/kendalls-correlation options x y))
  (^{:tag double} [x y]
  (tech.v3.datatype.statistics/kendalls-correlation x y)))


(defn kurtosis
  (^{:tag double} [x options]
  (tech.v3.datatype.statistics/kurtosis x options))
  (^{:tag double} [x]
  (tech.v3.datatype.statistics/kurtosis x)))


(defn linear-regressor
  "Create a simple linear regressor.  Returns a function that given a (double) 'x'
  predicts a (double) 'y'.  The function has metadata that contains the regressor and
  some regressor info, notably slope and intercept.

  Example:

```clojure
tech.v3.datatype.functional> (def regressor (linear-regressor [1 2 3] [4 5 6]))
#'tech.v3.datatype.functional/regressor
tech.v3.datatype.functional> (regressor 1)
4.0
tech.v3.datatype.functional> (regressor 2)
5.0
tech.v3.datatype.functional> (meta regressor)
{:regressor
  #object[org.apache.commons.math3.stat.regression.SimpleRegression 0x52091e82 \"org.apache.commons.math3.stat.regression.SimpleRegression@52091e82\"],
 :intercept 3.0,
 :slope 1.0,
 :mean-squared-error 0.0}
```"
  ([x y]
  (tech.v3.datatype.functional-api/linear-regressor x y)))


(defn log
  ([x options]
  (tech.v3.datatype.functional-api/log x options))
  ([x]
  (tech.v3.datatype.functional-api/log x)))


(defn log10
  ([x options]
  (tech.v3.datatype.functional-api/log10 x options))
  ([x]
  (tech.v3.datatype.functional-api/log10 x)))


(defn log1p
  ([x options]
  (tech.v3.datatype.functional-api/log1p x options))
  ([x]
  (tech.v3.datatype.functional-api/log1p x)))


(defn logistic
  ([x options]
  (tech.v3.datatype.functional-api/logistic x options))
  ([x]
  (tech.v3.datatype.functional-api/logistic x)))


(defn magnitude
  (^{:tag double} [x]
  (tech.v3.datatype.functional-api/magnitude x)))


(defn magnitude-squared
  (^{:tag double} [x]
  (tech.v3.datatype.functional-api/magnitude-squared x)))


(defn mathematical-integer?
  ([x options]
  (tech.v3.datatype.functional-api/mathematical-integer? x options))
  ([x]
  (tech.v3.datatype.functional-api/mathematical-integer? x)))


(defn max
  ([x]
  (tech.v3.datatype.functional-api/max x))
  ([x y]
  (tech.v3.datatype.functional-api/max x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/max x y args)))


(defn mean
  "double mean of x"
  (^{:tag double} [x options]
  (tech.v3.datatype.statistics/mean x options))
  (^{:tag double} [x]
  (tech.v3.datatype.statistics/mean x)))


(defn mean-fast
  "Take the mean of the x.  This operation doesn't know anything about nan hence it is
  a bit faster than the base [[mean]] fn."
  (^{:tag double} [x]
  (tech.v3.datatype.functional-api/mean-fast x)))


(defn median
  (^{:tag double} [x options]
  (tech.v3.datatype.statistics/median x options))
  (^{:tag double} [x]
  (tech.v3.datatype.statistics/median x)))


(defn min
  ([x]
  (tech.v3.datatype.functional-api/min x))
  ([x y]
  (tech.v3.datatype.functional-api/min x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/min x y args)))


(defn mode
  "Return the value of the most common occurance in the data."
  ([data]
  (tech.v3.datatype.statistics/mode data)))


(defn nan?
  ([x options]
  (tech.v3.datatype.functional-api/nan? x options))
  ([x]
  (tech.v3.datatype.functional-api/nan? x)))


(defn neg?
  ([x options]
  (tech.v3.datatype.functional-api/neg? x options))
  ([x]
  (tech.v3.datatype.functional-api/neg? x)))


(defn next-down
  ([x options]
  (tech.v3.datatype.functional-api/next-down x options))
  ([x]
  (tech.v3.datatype.functional-api/next-down x)))


(defn next-up
  ([x options]
  (tech.v3.datatype.functional-api/next-up x options))
  ([x]
  (tech.v3.datatype.functional-api/next-up x)))


(defn normalize
  ([x]
  (tech.v3.datatype.functional-api/normalize x)))


(defn not
  ([x options]
  (tech.v3.datatype.functional-api/not x options))
  ([x]
  (tech.v3.datatype.functional-api/not x)))


(defn not-eq
  ([x y]
  (tech.v3.datatype.functional-api/not-eq x y)))


(defn odd?
  ([x options]
  (tech.v3.datatype.functional-api/odd? x options))
  ([x]
  (tech.v3.datatype.functional-api/odd? x)))


(defn or
  ([x y]
  (tech.v3.datatype.functional-api/or x y)))


(defn pearsons-correlation
  (^{:tag double} [options x y]
  (tech.v3.datatype.statistics/pearsons-correlation options x y))
  (^{:tag double} [x y]
  (tech.v3.datatype.statistics/pearsons-correlation x y)))


(defn percentiles
  "Create a reader of percentile values, one for each percentage passed in.
  Estimation types are in the set of #{:r1,r2...legacy} and are described
  here: https://commons.apache.org/proper/commons-math/javadocs/api-3.3/index.html.

  nan-strategy can be one of [:keep :remove :exception] and defaults to :exception."
  (^{:tag tech.v3.datatype.Buffer} [percentages options x]
  (tech.v3.datatype.statistics/percentiles percentages options x))
  (^{:tag tech.v3.datatype.Buffer} [percentages x]
  (tech.v3.datatype.statistics/percentiles percentages x)))


(defn pos?
  ([x options]
  (tech.v3.datatype.functional-api/pos? x options))
  ([x]
  (tech.v3.datatype.functional-api/pos? x)))


(defn pow
  ([x y]
  (tech.v3.datatype.functional-api/pow x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/pow x y args)))


(defn quartile-1
  (^{:tag double} [x options]
  (tech.v3.datatype.statistics/quartile-1 x options))
  (^{:tag double} [x]
  (tech.v3.datatype.statistics/quartile-1 x)))


(defn quartile-3
  (^{:tag double} [x options]
  (tech.v3.datatype.statistics/quartile-3 x options))
  (^{:tag double} [x]
  (tech.v3.datatype.statistics/quartile-3 x)))


(defn quartile-outlier-fn
  "Create a function that, given floating point data, will return true or false
  if that data is an outlier.  Default range mult is 1.5:

```clojure
  (or (< val (- q1 (* range-mult iqr)))
      (> val (+ q3 (* range-mult iqr)))
```

  Options:
  * `:range-mult` - the multiplier used."
  ([x & args]
  (apply tech.v3.datatype.statistics/quartile-outlier-fn x args)))


(defn quartiles
  "return [min, 25 50 75 max] of item"
  (^{:tag tech.v3.datatype.Buffer} [x]
  (tech.v3.datatype.statistics/quartiles x))
  (^{:tag tech.v3.datatype.Buffer} [options x]
  (tech.v3.datatype.statistics/quartiles options x)))


(defn quot
  ([x y]
  (tech.v3.datatype.functional-api/quot x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/quot x y args)))


(defn reduce-*
  ([x]
  (tech.v3.datatype.functional-api/reduce-* x)))


(defn reduce-+
  ([x]
  (tech.v3.datatype.functional-api/reduce-+ x)))


(defn reduce-max
  ([x]
  (tech.v3.datatype.functional-api/reduce-max x)))


(defn reduce-min
  ([x]
  (tech.v3.datatype.functional-api/reduce-min x)))


(defn rem
  ([x y]
  (tech.v3.datatype.functional-api/rem x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/rem x y args)))


(defn rint
  ([x options]
  (tech.v3.datatype.functional-api/rint x options))
  ([x]
  (tech.v3.datatype.functional-api/rint x)))


(defn round
  "Vectorized implementation of Math/round.  Operates in double space
  but returns a long or long reader."
  ([arg options]
  (tech.v3.datatype.functional-api/round arg options))
  ([arg]
  (tech.v3.datatype.functional-api/round arg)))


(defn shift
  "Shift by n and fill in with the first element for n>0 or last element for n<0.

  Examples:

```clojure
user> (dfn/shift (range 10) 2)
[0 0 0 1 2 3 4 5 6 7]
user> (dfn/shift (range 10) -2)
[2 3 4 5 6 7 8 9 9 9]
```"
  (^{:tag tech.v3.datatype.Buffer} [x n]
  (tech.v3.datatype.functional-api/shift x n)))


(defn signum
  ([x options]
  (tech.v3.datatype.functional-api/signum x options))
  ([x]
  (tech.v3.datatype.functional-api/signum x)))


(defn sin
  ([x options]
  (tech.v3.datatype.functional-api/sin x options))
  ([x]
  (tech.v3.datatype.functional-api/sin x)))


(defn sinh
  ([x options]
  (tech.v3.datatype.functional-api/sinh x options))
  ([x]
  (tech.v3.datatype.functional-api/sinh x)))


(defn skew
  (^{:tag double} [x options]
  (tech.v3.datatype.statistics/skew x options))
  (^{:tag double} [x]
  (tech.v3.datatype.statistics/skew x)))


(defn spearmans-correlation
  (^{:tag double} [options x y]
  (tech.v3.datatype.statistics/spearmans-correlation options x y))
  (^{:tag double} [x y]
  (tech.v3.datatype.statistics/spearmans-correlation x y)))


(defn sq
  ([x options]
  (tech.v3.datatype.functional-api/sq x options))
  ([x]
  (tech.v3.datatype.functional-api/sq x)))


(defn sqrt
  ([x options]
  (tech.v3.datatype.functional-api/sqrt x options))
  ([x]
  (tech.v3.datatype.functional-api/sqrt x)))


(defn standard-deviation
  (^{:tag double} [x options]
  (tech.v3.datatype.statistics/standard-deviation x options))
  (^{:tag double} [x]
  (tech.v3.datatype.statistics/standard-deviation x)))


(defn sum
  "Double sum of data using
  [Kahan compensated summation](https://en.wikipedia.org/wiki/Kahan_summation_algorithm)."
  (^{:tag double} [x options]
  (tech.v3.datatype.statistics/sum x options))
  (^{:tag double} [x]
  (tech.v3.datatype.statistics/sum x)))


(defn sum-fast
  "Find the sum of the data.  This operation is neither nan-aware nor does it implement
  kahans compensation although via parallelization it implements pairwise summation
  compensation.  For a more but slightly slower but far more correct sum operator,
  use [[sum]]."
  (^{:tag double} [x]
  (tech.v3.datatype.functional-api/sum-fast x)))


(defn tan
  ([x options]
  (tech.v3.datatype.functional-api/tan x options))
  ([x]
  (tech.v3.datatype.functional-api/tan x)))


(defn tanh
  ([x options]
  (tech.v3.datatype.functional-api/tanh x options))
  ([x]
  (tech.v3.datatype.functional-api/tanh x)))


(defn to-degrees
  ([x options]
  (tech.v3.datatype.functional-api/to-degrees x options))
  ([x]
  (tech.v3.datatype.functional-api/to-degrees x)))


(defn to-radians
  ([x options]
  (tech.v3.datatype.functional-api/to-radians x options))
  ([x]
  (tech.v3.datatype.functional-api/to-radians x)))


(defn ulp
  ([x options]
  (tech.v3.datatype.functional-api/ulp x options))
  ([x]
  (tech.v3.datatype.functional-api/ulp x)))


(defn unsigned-bit-shift-right
  ([x y]
  (tech.v3.datatype.functional-api/unsigned-bit-shift-right x y))
  ([x y & args]
  (apply tech.v3.datatype.functional-api/unsigned-bit-shift-right x y args)))


(defn variance
  (^{:tag double} [x options]
  (tech.v3.datatype.statistics/variance x options))
  (^{:tag double} [x]
  (tech.v3.datatype.statistics/variance x)))


(defn zero?
  ([x options]
  (tech.v3.datatype.functional-api/zero? x options))
  ([x]
  (tech.v3.datatype.functional-api/zero? x)))


