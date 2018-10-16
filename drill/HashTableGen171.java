
package org.apache.drill.exec.test.generated;

import org.apache.drill.exec.exception.SchemaChangeException;
import org.apache.drill.exec.expr.holders.IntHolder;
import org.apache.drill.exec.expr.holders.VarCharHolder;
import org.apache.drill.exec.physical.impl.common.HashTableTemplate;
import org.apache.drill.exec.record.RecordBatch;
import org.apache.drill.exec.record.VectorContainer;
import org.apache.drill.exec.vector.VarCharVector;

public class HashTableGen171
    extends HashTableTemplate
{

    VarCharVector vv0;

    public HashTableGen171() {
        try {
            __DRILL_INIT__();
        } catch (SchemaChangeException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    protected HashTableTemplate.BatchHolder newBatchHolder(int arg1, int arg2) {
        return new HashTableGen171 .BatchHolder(arg1, arg2);
    }

    public void doSetup(VectorContainer incomingBuild, RecordBatch incomingProbe)
        throws SchemaChangeException
    {
        {
            int[] fieldIds1 = new int[ 1 ] ;
            fieldIds1 [ 0 ] = 0;
            Object tmp2 = (incomingBuild).getValueAccessorById(VarCharVector.class, fieldIds1).getValueVector();
            if (tmp2 == null) {
                throw new SchemaChangeException("Failure while loading vector vv0 with id: TypedFieldId [fieldIds=[0], remainder=null].");
            }
            vv0 = ((VarCharVector) tmp2);
            /** start SETUP for function hash32 **/ 
            {
                 {}
            }
            /** end SETUP for function hash32 **/ 
        }
    }

    public int getHashBuild(int incomingRowIdx, int seedValue)
        throws SchemaChangeException
    {
        {
            VarCharHolder out3 = new VarCharHolder();
            {
                out3 .buffer = vv0 .getBuffer();
                long startEnd = vv0 .getAccessor().getStartEnd((incomingRowIdx));
                out3 .start = ((int) startEnd);
                out3 .end = ((int)(startEnd >> 32));
            }
            IntHolder seedValue4 = new IntHolder();
            seedValue4 .value = seedValue;
            //---- start of eval portion of hash32 function. ----//
            IntHolder out5 = new IntHolder();
            {
                final IntHolder out = new IntHolder();
                VarCharHolder in = out3;
                IntHolder seed = seedValue4;
                 
Hash32FunctionsWithSeed$VarCharHash_eval: {
    out.value = org.apache.drill.exec.expr.fn.impl.HashHelper.hash32(in.start, in.end, in.buffer, seed.value);
}
 
                out5 = out;
            }
            //---- end of eval portion of hash32 function. ----//
            seedValue = out5 .value;
            return seedValue;
        }
    }

    public int getHashProbe(int incomingRowIdx, int seedValue)
        throws SchemaChangeException
    {
        {
            return  0;
        }
    }

    public void __DRILL_INIT__()
        throws SchemaChangeException
    {
    }

    private final class BatchHolder
        extends HashTableTemplate.BatchHolder
    {

        VarCharVector vv0;
        VarCharVector vv4;
        VarCharVector vv9;
        VarCharVector vv13;
        VarCharVector vv16;
        VarCharVector vv20;

        public BatchHolder(int arg1, int arg2) {
            super(arg1, arg2);
            try {
                __DRILL_INIT__();
            } catch (SchemaChangeException e) {
                throw new UnsupportedOperationException(e);
            }
        }

        public boolean isKeyMatchInternalBuild(int incomingRowIdx, int htRowIdx)
            throws SchemaChangeException
        {
            {
                VarCharHolder out3 = new VarCharHolder();
                {
                    out3 .buffer = vv0 .getBuffer();
                    long startEnd = vv0 .getAccessor().getStartEnd((incomingRowIdx));
                    out3 .start = ((int) startEnd);
                    out3 .end = ((int)(startEnd >> 32));
                }
                VarCharHolder out7 = new VarCharHolder();
                {
                    out7 .buffer = vv4 .getBuffer();
                    long startEnd = vv4 .getAccessor().getStartEnd((htRowIdx));
                    out7 .start = ((int) startEnd);
                    out7 .end = ((int)(startEnd >> 32));
                }
                //---- start of eval portion of compare_to_nulls_high function. ----//
                IntHolder out8 = new IntHolder();
                {
                    final IntHolder out = new IntHolder();
                    VarCharHolder left = out3;
                    VarCharHolder right = out7;
                     
GCompareVarCharVsVarChar$GCompareVarCharVsVarCharNullHigh_eval: {
    outside:
    {
        out.value = org.apache.drill.exec.expr.fn.impl.ByteFunctionHelpers.compare(
            left.buffer,
            left.start,
            left.end,
            right.buffer,
            right.start,
            right.end
        );
    }
}
 
                    out8 = out;
                }
                //---- end of eval portion of compare_to_nulls_high function. ----//
                if (out8 .value!= 0) {
                    return false;
                }
                return true;
            }
        }

        public boolean isKeyMatchInternalProbe(int incomingRowIdx, int htRowIdx)
            throws SchemaChangeException
        {
            {
                return false;
            }
        }

        public void outputRecordKeys(int htRowIdx, int outRowIdx)
            throws SchemaChangeException
        {
            {
                VarCharHolder out19 = new VarCharHolder();
                {
                    out19 .buffer = vv16 .getBuffer();
                    long startEnd = vv16 .getAccessor().getStartEnd((htRowIdx));
                    out19 .start = ((int) startEnd);
                    out19 .end = ((int)(startEnd >> 32));
                }
                vv20 .getMutator().setSafe((outRowIdx), out19 .start, out19 .end, out19 .buffer);
            }
        }

        public void setValue(int incomingRowIdx, int htRowIdx)
            throws SchemaChangeException
        {
            {
                VarCharHolder out12 = new VarCharHolder();
                {
                    out12 .buffer = vv9 .getBuffer();
                    long startEnd = vv9 .getAccessor().getStartEnd((incomingRowIdx));
                    out12 .start = ((int) startEnd);
                    out12 .end = ((int)(startEnd >> 32));
                }
                vv13 .getMutator().setSafe((htRowIdx), out12 .start, out12 .end, out12 .buffer);
            }
        }

        public void setupInterior(VectorContainer incomingBuild, RecordBatch incomingProbe, RecordBatch outgoing, VectorContainer htContainer)
            throws SchemaChangeException
        {
            {
                int[] fieldIds1 = new int[ 1 ] ;
                fieldIds1 [ 0 ] = 0;
                Object tmp2 = (incomingBuild).getValueAccessorById(VarCharVector.class, fieldIds1).getValueVector();
                if (tmp2 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv0 with id: TypedFieldId [fieldIds=[0], remainder=null].");
                }
                vv0 = ((VarCharVector) tmp2);
                int[] fieldIds5 = new int[ 1 ] ;
                fieldIds5 [ 0 ] = 0;
                Object tmp6 = (htContainer).getValueAccessorById(VarCharVector.class, fieldIds5).getValueVector();
                if (tmp6 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv4 with id: TypedFieldId [fieldIds=[0], remainder=null].");
                }
                vv4 = ((VarCharVector) tmp6);
                /** start SETUP for function compare_to_nulls_high **/ 
                {
                     {}
                }
                /** end SETUP for function compare_to_nulls_high **/ 
                int[] fieldIds10 = new int[ 1 ] ;
                fieldIds10 [ 0 ] = 0;
                Object tmp11 = (incomingBuild).getValueAccessorById(VarCharVector.class, fieldIds10).getValueVector();
                if (tmp11 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv9 with id: TypedFieldId [fieldIds=[0], remainder=null].");
                }
                vv9 = ((VarCharVector) tmp11);
                int[] fieldIds14 = new int[ 1 ] ;
                fieldIds14 [ 0 ] = 0;
                Object tmp15 = (htContainer).getValueAccessorById(VarCharVector.class, fieldIds14).getValueVector();
                if (tmp15 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv13 with id: TypedFieldId [fieldIds=[0], remainder=null].");
                }
                vv13 = ((VarCharVector) tmp15);
            }
            {
                int[] fieldIds17 = new int[ 1 ] ;
                fieldIds17 [ 0 ] = 0;
                Object tmp18 = (htContainer).getValueAccessorById(VarCharVector.class, fieldIds17).getValueVector();
                if (tmp18 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv16 with id: TypedFieldId [fieldIds=[0], remainder=null].");
                }
                vv16 = ((VarCharVector) tmp18);
                int[] fieldIds21 = new int[ 1 ] ;
                fieldIds21 [ 0 ] = 0;
                Object tmp22 = (outgoing).getValueAccessorById(VarCharVector.class, fieldIds21).getValueVector();
                if (tmp22 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv20 with id: TypedFieldId [fieldIds=[0], remainder=null].");
                }
                vv20 = ((VarCharVector) tmp22);
            }
        }

        public void __DRILL_INIT__()
            throws SchemaChangeException
        {
        }

    }

}
