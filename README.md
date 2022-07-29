# Data-Structures-And-Algorithm
数据结构与算法分析, Java/Go/Rust/C/React 多种语言实现

# Reference
+ [数据结构与算法分析-C语言描述](./数据结构与算法分析：C语言描述（第2版）.pdf): 

  https://awesome-programming-books.github.io/algorithms/%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E4%B8%8E%E7%AE%97%E6%B3%95%E5%88%86%E6%9E%90%EF%BC%9AC%E8%AF%AD%E8%A8%80%E6%8F%8F%E8%BF%B0%EF%BC%88%E7%AC%AC2%E7%89%88%EF%BC%89.pdf

+ [算法导论](./算法导论中文版.pdf): 

  https://github.com/mymmsc/books/blob/master/%E7%AE%97%E6%B3%95%E5%AF%BC%E8%AE%BA%E4%B8%AD%E6%96%87%E7%89%88.pdf

# Table of Contents
+ [Java - ongoing](Java)
+ [Go - ongoing](Go)
+ [Rust - ongoing](Rust)
+ [C - ongoing](C)
+ [React - ongoing](React)

# Before You Start
## 数学公式复习
### 指数
+ $X^aX^b=X^{a+b}$

+ $\frac{X^a}{X^b}=X^{a-b}$

- $(X^a)^b=X^{ab}$

- $X^a+X^a=2X^a$

- $2^a+2^a=2^{a+1}$

### 对数
一般, 以 2 为底数

定义: $X^a=B, 则当且仅当 log_xB=a$

- $log_AB=\frac{log_cB}{log_cA}$

  证明: 

  $$
  C^x=B, C^y=A, A^z=B\\
  => C^x =B=A^z=(C^y)^z\\
  => C^x=(C^y)^z\\
  => log_AB = z = x/y = \frac{log_CB}{log_CA}
  $$
  
- $logAB=logA+logB$

- $logA/B=logA-logB$

- $log(A^B)=B{\,}logA$

- $logX < X(对所有的X>0成立)$

- $log1=0, log2=1, log1024=10,log1048576=20$

### 级数

+ $\sum_{i=0}^{N}2^i=2^{N+1}-1$

+ $\sum_{i=0}^{N}A^i=\frac{A^{N+1}-1}{A-1},若 0 \lt A \lt 1, 则 \sum_{i=0}^{N}A^i \le \frac{1}{1-A}$

  证明: 
  $$
   S = \sum_{i=1}^{0}A^i
  $$
  
+ $\sum_{i=1}^{+\infty}i/2^i = 2$

  证明: 
  $$
  S = \frac{1}{2} + \frac{2}{2^2} + \frac{3}{2^3} + \frac{4}{2^4} + ... \\
  2 * S, 得 2S = 1 + \frac{2}{2^1} + \frac{3}{2^2} + \frac{4}{2^3} + ... \\
  两式相减, S = 1 + \frac{1}{2} + \frac{1}{2^2} + \frac{1}{2^3} + \frac{1}{2^4} + ... \\
  等差数列, S = 2
  $$
  


































