with B AS (
    select YEAR(DIFFERENTIATION_DATE) as year, MAX(SIZE_OF_COLONY) as MAX_FOR_YEAR
        from ECOLI_DATA
        group by YEAR(DIFFERENTIATION_DATE)
)

select B.year, B.MAX_FOR_YEAR - A.SIZE_OF_COLONY as YEAR_DEV, A.ID
from ECOLI_DATA as A
join B on YEAR(A.DIFFERENTIATION_DATE) = B.year
order by B.year, YEAR_DEV
