## 数学基础
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
  \begin{aligned}
  &C^x=B, C^y=A, A^z=B\\
  =>{\,}& C^x =B=A^z=(C^y)^z\\
  =>{\,}& C^x=(C^y)^z\\
  =>{\,}& log_AB = z = x/y = \frac{log_CB}{log_CA}
  \end{aligned}
  $$

- $logAB=logA+logB$

- $logA/B=logA-logB$

- $log(A^B)=B{\,}logA$

- $logX < X(对所有的X>0成立)$

- $log1=0, log2=1, log1024=10,log1048576=20$

### 级数

+ $\sum_{i=0}^{N}2^i=2^{N+1}-1$

+ $\sum_{i=0}^{N}A^i=\frac{A^{N+1}-1}{A-1},若 0<A<1, 则 \sum_{i=0}^{N}A^i\le\frac{1}{1-A}$

  证明: 
  $$
  \begin{aligned}
   S &= \sum_{i=1}^{+\infty}A^i, (0<A<1)\\
  S &= 1 + A + A^2 + A^3 + ...\\
  AS &= A + A^2 + A^3 + A^4 + ...\\
  将两式相减, S - AS &= 1 + (A^{+\infty} -> 0)\\
   当S -> +\infty,  S &= \frac{1}{1-A}, \\ 
   因 N \le +\infty,  故\sum_{i=0}^{N}A^i = S_N &\le S = \frac{1}{1-A}, \\
  \end{aligned}
  $$

+ $\sum_{i=1}^{+\infty}i/2^i$ = 2

  证明: 
  $$
  \begin{aligned}
  S &= \frac{1}{2} + \frac{2}{2^2} + \frac{3}{2^3} + \frac{4}{2^4} + ... \\
  2 * S, 得 2S &= 1 + \frac{2}{2^1} + \frac{3}{2^2} + \frac{4}{2^3} + ... \\
  两式相减, S &= 1 + \frac{1}{2} + \frac{1}{2^2} + \frac{1}{2^3} + \frac{1}{2^4} + ... \\
  等差数列, S &= 2
  \end{aligned}
  $$

+ 