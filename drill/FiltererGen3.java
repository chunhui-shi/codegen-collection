
package org.apache.drill.exec.test.generated;

import org.apache.drill.exec.exception.SchemaChangeException;
import org.apache.drill.exec.expr.holders.BitHolder;
import org.apache.drill.exec.expr.holders.VarCharHolder;
import org.apache.drill.exec.ops.FragmentContext;
import org.apache.drill.exec.physical.impl.filter.FilterTemplate2;
import org.apache.drill.exec.record.RecordBatch;
import org.apache.drill.exec.vector.ValueHolderHelper;
import org.apache.drill.exec.vector.VarCharVector;

public class FiltererGen3
    extends FilterTemplate2
{

    VarCharVector vv0;
    VarCharHolder string4;
    VarCharHolder constant5;

    public FiltererGen3() {
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
            VarCharHolder out3 = new VarCharHolder();
            {
                out3 .buffer = vv0 .getBuffer();
                long startEnd = vv0 .getAccessor().getStartEnd((inIndex));
                out3 .start = ((int) startEnd);
                out3 .end = ((int)(startEnd >> 32));
            }
            //---- start of eval portion of equal function. ----//
            BitHolder out6 = new BitHolder();
            {
                final BitHolder out = new BitHolder();
                VarCharHolder left = out3;
                VarCharHolder right = constant5;
                 
GCompareVarCharVsVarChar$EqualsVarCharVsVarChar_eval: {
    out.value = org.apache.drill.exec.expr.fn.impl.ByteFunctionHelpers.equal(
        left.buffer,
        left.start,
        left.end,
        right.buffer,
        right.start,
        right.end
    );
}
 
                out6 = out;
            }
            //---- end of eval portion of equal function. ----//
            return (out6 .value == 1);
        }
    }

    public void doSetup(FragmentContext context, RecordBatch incoming, RecordBatch outgoing)
        throws SchemaChangeException
    {
        {
            int[] fieldIds1 = new int[ 1 ] ;
            fieldIds1 [ 0 ] = 1;
            Object tmp2 = (incoming).getValueAccessorById(VarCharVector.class, fieldIds1).getValueVector();
            if (tmp2 == null) {
                throw new SchemaChangeException("Failure while loading vector vv0 with id: TypedFieldId [fieldIds=[1], remainder=null].");
            }
            vv0 = ((VarCharVector) tmp2);
            string4 = ValueHolderHelper.getVarCharHolder((incoming).getContext().getManagedBuffer(), "EUROPE");
            constant5 = string4;
            /** start SETUP for function equal **/ 
            {
                VarCharHolder right = constant5;
                 {}
            }
            /** end SETUP for function equal **/ 
        }
    }

    public void __DRILL_INIT__()
        throws SchemaChangeException
    {
    }

}
