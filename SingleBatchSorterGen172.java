
package org.apache.drill.exec.test.generated;

import org.apache.drill.exec.exception.SchemaChangeException;
import org.apache.drill.exec.expr.holders.IntHolder;
import org.apache.drill.exec.expr.holders.NullableFloat8Holder;
import org.apache.drill.exec.ops.FragmentContext;
import org.apache.drill.exec.physical.impl.xsort.SingleBatchSorterTemplate;
import org.apache.drill.exec.record.RecordBatch;
import org.apache.drill.exec.record.VectorAccessible;
import org.apache.drill.exec.vector.NullableFloat8Vector;

public class SingleBatchSorterGen172
    extends SingleBatchSorterTemplate
{

    NullableFloat8Vector vv0;
    NullableFloat8Vector vv4;

    public SingleBatchSorterGen172() {
        try {
            __DRILL_INIT__();
        } catch (SchemaChangeException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public int doEval(char leftIndex, char rightIndex)
        throws SchemaChangeException
    {
        {
            NullableFloat8Holder out3 = new NullableFloat8Holder();
            {
                out3 .isSet = vv0 .getAccessor().isSet((leftIndex));
                if (out3 .isSet == 1) {
                    out3 .value = vv0 .getAccessor().get((leftIndex));
                }
            }
            NullableFloat8Holder out7 = new NullableFloat8Holder();
            {
                out7 .isSet = vv4 .getAccessor().isSet((rightIndex));
                if (out7 .isSet == 1) {
                    out7 .value = vv4 .getAccessor().get((rightIndex));
                }
            }
            //---- start of eval portion of compare_to_nulls_high function. ----//
            IntHolder out8 = new IntHolder();
            {
                final IntHolder out = new IntHolder();
                NullableFloat8Holder left = out3;
                NullableFloat8Holder right = out7;
                 
GCompareFloat8VsFloat8$GCompareNullableFloat8VsNullableFloat8NullHigh_eval: {
    outside:
    {
        if (left.isSet == 0) {
            if (right.isSet == 0) {
                out.value = 0;
                break outside;
            } else
            {
                out.value = 1;
                break outside;
            }
        } else
        if (right.isSet == 0) {
            out.value = -1;
            break outside;
        }
        if (Double.isNaN(left.value) && Double.isNaN(right.value)) {
            out.value = 0;
        } else
        if (!Double.isNaN(left.value) && Double.isNaN(right.value)) {
            out.value = -1;
        } else
        if (Double.isNaN(left.value) && !Double.isNaN(right.value)) {
            out.value = 1;
        } else
        {
            out.value = left.value < right.value ? -1 : (left.value == right.value ? 0 : 1);
        }
    }
}
 
                out8 = out;
            }
            //---- end of eval portion of compare_to_nulls_high function. ----//
            if (out8 .value!= 0) {
                return (-out8 .value);
            }
        }
        {
            return  0;
        }
    }

    public void doSetup(FragmentContext context, VectorAccessible incoming, RecordBatch outgoing)
        throws SchemaChangeException
    {
        {
            int[] fieldIds1 = new int[ 1 ] ;
            fieldIds1 [ 0 ] = 1;
            Object tmp2 = (incoming).getValueAccessorById(NullableFloat8Vector.class, fieldIds1).getValueVector();
            if (tmp2 == null) {
                throw new SchemaChangeException("Failure while loading vector vv0 with id: TypedFieldId [fieldIds=[1], remainder=null].");
            }
            vv0 = ((NullableFloat8Vector) tmp2);
            int[] fieldIds5 = new int[ 1 ] ;
            fieldIds5 [ 0 ] = 1;
            Object tmp6 = (incoming).getValueAccessorById(NullableFloat8Vector.class, fieldIds5).getValueVector();
            if (tmp6 == null) {
                throw new SchemaChangeException("Failure while loading vector vv4 with id: TypedFieldId [fieldIds=[1], remainder=null].");
            }
            vv4 = ((NullableFloat8Vector) tmp6);
            /** start SETUP for function compare_to_nulls_high **/ 
            {
                 {}
            }
            /** end SETUP for function compare_to_nulls_high **/ 
        }
    }

    public void __DRILL_INIT__()
        throws SchemaChangeException
    {
    }

}
