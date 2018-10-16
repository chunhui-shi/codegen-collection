
package org.apache.drill.exec.test.generated;

import org.apache.drill.exec.exception.SchemaChangeException;
import org.apache.drill.exec.expr.holders.BitHolder;
import org.apache.drill.exec.expr.holders.DateHolder;
import org.apache.drill.exec.expr.holders.TimeStampHolder;
import org.apache.drill.exec.ops.FragmentContext;
import org.apache.drill.exec.physical.impl.filter.FilterTemplate2;
import org.apache.drill.exec.record.RecordBatch;
import org.apache.drill.exec.vector.DateVector;

public class FiltererGen0
    extends FilterTemplate2
{

    DateVector vv1;
    DateHolder constant6;
    TimeStampHolder constant10;

    public FiltererGen0() {
        try {
            __DRILL_INIT__();
        } catch (SchemaChangeException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public boolean doEval(int inIndex, int outIndex)
        throws SchemaChangeException
    {
        {
            BitHolder out0 = new BitHolder();
            AndOP0:
            {
                DateHolder out4 = new DateHolder();
                {
                    out4 .value = vv1 .getAccessor().get((inIndex));
                }
                //---- start of eval portion of greater_than_or_equal_to function. ----//
                BitHolder out7 = new BitHolder();
                {
                    final BitHolder out = new BitHolder();
                    DateHolder left = out4;
                    DateHolder right = constant6;
                     
GCompareDateVsDate$GreaterThanEqDateVsDate_eval: {
    if (Double.isNaN(left.value)) {
        out.value = 1;
    } else
    if (!Double.isNaN(left.value) && Double.isNaN(right.value)) {
        out.value = 0;
    } else
    {
        out.value = left.value >= right.value ? 1 : 0;
    }
}
 
                    out7 = out;
                }
                //---- end of eval portion of greater_than_or_equal_to function. ----//
                if (out7 .value!= 1) {
                    out0 .value = 0;
                    break AndOP0;
                }
                //---- start of eval portion of castTIMESTAMP function. ----//
                TimeStampHolder out8 = new TimeStampHolder();
                {
                    final TimeStampHolder out = new TimeStampHolder();
                    DateHolder in = out4;
                     
CastDateToTimeStamp_eval: {
    out.value = in.value;
}
 
                    out8 = out;
                }
                //---- end of eval portion of castTIMESTAMP function. ----//
                //---- start of eval portion of less_than function. ----//
                BitHolder out11 = new BitHolder();
                {
                    final BitHolder out = new BitHolder();
                    TimeStampHolder left = out8;
                    TimeStampHolder right = constant10;
                     
GCompareTimeStampVsTimeStamp$LessThanTimeStampVsTimeStamp_eval: {
    if (Double.isNaN(left.value) || (Double.isNaN(left.value) && Double.isNaN(right.value))) {
        out.value = 0;
    } else
    if (Double.isNaN(right.value) && !Double.isNaN(left.value)) {
        out.value = 1;
    } else
    {
        out.value = left.value < right.value ? 1 : 0;
    }
}
 
                    out11 = out;
                }
                //---- end of eval portion of less_than function. ----//
                if (out11 .value!= 1) {
                    out0 .value = 0;
                    break AndOP0;
                }
                out0 .value = 1;
            }
            return (out0 .value == 1);
        }
    }

    public void doSetup(FragmentContext context, RecordBatch incoming, RecordBatch outgoing)
        throws SchemaChangeException
    {
        {
            int[] fieldIds2 = new int[ 1 ] ;
            fieldIds2 [ 0 ] = 2;
            Object tmp3 = (incoming).getValueAccessorById(DateVector.class, fieldIds2).getValueVector();
            if (tmp3 == null) {
                throw new SchemaChangeException("Failure while loading vector vv1 with id: TypedFieldId [fieldIds=[2], remainder=null].");
            }
            vv1 = ((DateVector) tmp3);
            DateHolder out5 = new DateHolder();
            out5 .value = 852076800000L;
            constant6 = out5;
            /** start SETUP for function greater_than_or_equal_to **/ 
            {
                DateHolder right = constant6;
                 {}
            }
            /** end SETUP for function greater_than_or_equal_to **/ 
            /** start SETUP for function castTIMESTAMP **/ 
            {
                 {}
            }
            /** end SETUP for function castTIMESTAMP **/ 
            TimeStampHolder out9 = new TimeStampHolder();
            out9 .value = 883612800000L;
            constant10 = out9;
            /** start SETUP for function less_than **/ 
            {
                TimeStampHolder right = constant10;
                 {}
            }
            /** end SETUP for function less_than **/ 
        }
    }

    public void __DRILL_INIT__()
        throws SchemaChangeException
    {
    }

}
