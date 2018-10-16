
package org.apache.drill.exec.test.generated;

import org.apache.drill.exec.exception.SchemaChangeException;
import org.apache.drill.exec.expr.holders.IntHolder;
import org.apache.drill.exec.physical.impl.common.HashTableTemplate;
import org.apache.drill.exec.record.RecordBatch;
import org.apache.drill.exec.record.VectorContainer;
import org.apache.drill.exec.vector.IntVector;

public class HashTableGen11
    extends HashTableTemplate
{

    IntVector vv0;
    IntVector vv6;

    public HashTableGen11() {
        try {
            __DRILL_INIT__();
        } catch (SchemaChangeException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    protected HashTableTemplate.BatchHolder newBatchHolder(int arg1, int arg2) {
        return new HashTableGen11 .BatchHolder(arg1, arg2);
    }

    public void doSetup(VectorContainer incomingBuild, RecordBatch incomingProbe)
        throws SchemaChangeException
    {
        {
            int[] fieldIds1 = new int[ 1 ] ;
            fieldIds1 [ 0 ] = 0;
            Object tmp2 = (incomingBuild).getValueAccessorById(IntVector.class, fieldIds1).getValueVector();
            if (tmp2 == null) {
                throw new SchemaChangeException("Failure while loading vector vv0 with id: TypedFieldId [fieldIds=[0], remainder=null].");
            }
            vv0 = ((IntVector) tmp2);
            /** start SETUP for function hash32AsDouble **/ 
            {
                 {}
            }
            /** end SETUP for function hash32AsDouble **/ 
            int[] fieldIds7 = new int[ 1 ] ;
            fieldIds7 [ 0 ] = 2;
            Object tmp8 = (incomingProbe).getValueAccessorById(IntVector.class, fieldIds7).getValueVector();
            if (tmp8 == null) {
                throw new SchemaChangeException("Failure while loading vector vv6 with id: TypedFieldId [fieldIds=[2], remainder=null].");
            }
            vv6 = ((IntVector) tmp8);
            /** start SETUP for function hash32AsDouble **/ 
            {
                 {}
            }
            /** end SETUP for function hash32AsDouble **/ 
        }
    }

    public int getHashBuild(int incomingRowIdx, int seedValue)
        throws SchemaChangeException
    {
        {
            IntHolder out3 = new IntHolder();
            {
                out3 .value = vv0 .getAccessor().get((incomingRowIdx));
            }
            IntHolder seedValue4 = new IntHolder();
            seedValue4 .value = seedValue;
            //---- start of eval portion of hash32AsDouble function. ----//
            IntHolder out5 = new IntHolder();
            {
                final IntHolder out = new IntHolder();
                IntHolder in = out3;
                IntHolder seed = seedValue4;
                 
Hash32WithSeedAsDouble$IntHash_eval: {
    out.value = org.apache.drill.exec.expr.fn.impl.HashHelper.hash32((double) in.value, seed.value);
}
 
                out5 = out;
            }
            //---- end of eval portion of hash32AsDouble function. ----//
            seedValue = out5 .value;
            return seedValue;
        }
    }

    public int getHashProbe(int incomingRowIdx, int seedValue)
        throws SchemaChangeException
    {
        {
            IntHolder out9 = new IntHolder();
            {
                out9 .value = vv6 .getAccessor().get((incomingRowIdx));
            }
            IntHolder seedValue10 = new IntHolder();
            seedValue10 .value = seedValue;
            //---- start of eval portion of hash32AsDouble function. ----//
            IntHolder out11 = new IntHolder();
            {
                final IntHolder out = new IntHolder();
                IntHolder in = out9;
                IntHolder seed = seedValue10;
                 
Hash32WithSeedAsDouble$IntHash_eval: {
    out.value = org.apache.drill.exec.expr.fn.impl.HashHelper.hash32((double) in.value, seed.value);
}
 
                out11 = out;
            }
            //---- end of eval portion of hash32AsDouble function. ----//
            seedValue = out11 .value;
            return seedValue;
        }
    }

    public void __DRILL_INIT__()
        throws SchemaChangeException
    {
    }

    private final class BatchHolder
        extends HashTableTemplate.BatchHolder
    {

        IntVector vv0;
        IntVector vv4;
        IntVector vv9;
        IntVector vv13;
        IntVector vv18;
        IntVector vv22;

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
                IntHolder out3 = new IntHolder();
                {
                    out3 .value = vv0 .getAccessor().get((incomingRowIdx));
                }
                IntHolder out7 = new IntHolder();
                {
                    out7 .value = vv4 .getAccessor().get((htRowIdx));
                }
                //---- start of eval portion of compare_to_nulls_high function. ----//
                IntHolder out8 = new IntHolder();
                {
                    final IntHolder out = new IntHolder();
                    IntHolder left = out3;
                    IntHolder right = out7;
                     
GCompareIntVsInt$GCompareIntVsIntNullHigh_eval: {
    outside:
    {
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
                    return false;
                }
                return true;
            }
        }

        public boolean isKeyMatchInternalProbe(int incomingRowIdx, int htRowIdx)
            throws SchemaChangeException
        {
            {
                IntHolder out12 = new IntHolder();
                {
                    out12 .value = vv9 .getAccessor().get((incomingRowIdx));
                }
                IntHolder out16 = new IntHolder();
                {
                    out16 .value = vv13 .getAccessor().get((htRowIdx));
                }
                //---- start of eval portion of compare_to_nulls_high function. ----//
                IntHolder out17 = new IntHolder();
                {
                    final IntHolder out = new IntHolder();
                    IntHolder left = out12;
                    IntHolder right = out16;
                     
GCompareIntVsInt$GCompareIntVsIntNullHigh_eval: {
    outside:
    {
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
 
                    out17 = out;
                }
                //---- end of eval portion of compare_to_nulls_high function. ----//
                if (out17 .value!= 0) {
                    return false;
                }
                return true;
            }
        }

        public void outputRecordKeys(int htRowIdx, int outRowIdx)
            throws SchemaChangeException
        {
        }

        public void setValue(int incomingRowIdx, int htRowIdx)
            throws SchemaChangeException
        {
            {
                IntHolder out21 = new IntHolder();
                {
                    out21 .value = vv18 .getAccessor().get((incomingRowIdx));
                }
                vv22 .getMutator().setSafe((htRowIdx), out21 .value);
            }
        }

        public void setupInterior(VectorContainer incomingBuild, RecordBatch incomingProbe, RecordBatch outgoing, VectorContainer htContainer)
            throws SchemaChangeException
        {
            {
                int[] fieldIds1 = new int[ 1 ] ;
                fieldIds1 [ 0 ] = 0;
                Object tmp2 = (incomingBuild).getValueAccessorById(IntVector.class, fieldIds1).getValueVector();
                if (tmp2 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv0 with id: TypedFieldId [fieldIds=[0], remainder=null].");
                }
                vv0 = ((IntVector) tmp2);
                int[] fieldIds5 = new int[ 1 ] ;
                fieldIds5 [ 0 ] = 0;
                Object tmp6 = (htContainer).getValueAccessorById(IntVector.class, fieldIds5).getValueVector();
                if (tmp6 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv4 with id: TypedFieldId [fieldIds=[0], remainder=null].");
                }
                vv4 = ((IntVector) tmp6);
                /** start SETUP for function compare_to_nulls_high **/ 
                {
                     {}
                }
                /** end SETUP for function compare_to_nulls_high **/ 
                int[] fieldIds10 = new int[ 1 ] ;
                fieldIds10 [ 0 ] = 2;
                Object tmp11 = (incomingProbe).getValueAccessorById(IntVector.class, fieldIds10).getValueVector();
                if (tmp11 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv9 with id: TypedFieldId [fieldIds=[2], remainder=null].");
                }
                vv9 = ((IntVector) tmp11);
                int[] fieldIds14 = new int[ 1 ] ;
                fieldIds14 [ 0 ] = 0;
                Object tmp15 = (htContainer).getValueAccessorById(IntVector.class, fieldIds14).getValueVector();
                if (tmp15 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv13 with id: TypedFieldId [fieldIds=[0], remainder=null].");
                }
                vv13 = ((IntVector) tmp15);
                /** start SETUP for function compare_to_nulls_high **/ 
                {
                     {}
                }
                /** end SETUP for function compare_to_nulls_high **/ 
                int[] fieldIds19 = new int[ 1 ] ;
                fieldIds19 [ 0 ] = 0;
                Object tmp20 = (incomingBuild).getValueAccessorById(IntVector.class, fieldIds19).getValueVector();
                if (tmp20 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv18 with id: TypedFieldId [fieldIds=[0], remainder=null].");
                }
                vv18 = ((IntVector) tmp20);
                int[] fieldIds23 = new int[ 1 ] ;
                fieldIds23 [ 0 ] = 0;
                Object tmp24 = (htContainer).getValueAccessorById(IntVector.class, fieldIds23).getValueVector();
                if (tmp24 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv22 with id: TypedFieldId [fieldIds=[0], remainder=null].");
                }
                vv22 = ((IntVector) tmp24);
            }
        }

        public void __DRILL_INIT__()
            throws SchemaChangeException
        {
        }

    }

}
