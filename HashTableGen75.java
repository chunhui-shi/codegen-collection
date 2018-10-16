
package org.apache.drill.exec.test.generated;

import org.apache.drill.exec.exception.SchemaChangeException;
import org.apache.drill.exec.expr.holders.IntHolder;
import org.apache.drill.exec.physical.impl.common.HashTableTemplate;
import org.apache.drill.exec.record.RecordBatch;
import org.apache.drill.exec.record.VectorContainer;
import org.apache.drill.exec.vector.IntVector;

public class HashTableGen75
    extends HashTableTemplate
{

    IntVector vv0;
    IntVector vv6;
    IntVector vv12;
    IntVector vv18;

    public HashTableGen75() {
        try {
            __DRILL_INIT__();
        } catch (SchemaChangeException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    protected HashTableTemplate.BatchHolder newBatchHolder(int arg1, int arg2) {
        return new HashTableGen75 .BatchHolder(arg1, arg2);
    }

    public void doSetup(VectorContainer incomingBuild, RecordBatch incomingProbe)
        throws SchemaChangeException
    {
        {
            int[] fieldIds1 = new int[ 1 ] ;
            fieldIds1 [ 0 ] = 5;
            Object tmp2 = (incomingBuild).getValueAccessorById(IntVector.class, fieldIds1).getValueVector();
            if (tmp2 == null) {
                throw new SchemaChangeException("Failure while loading vector vv0 with id: TypedFieldId [fieldIds=[5], remainder=null].");
            }
            vv0 = ((IntVector) tmp2);
            /** start SETUP for function hash32AsDouble **/ 
            {
                 {}
            }
            /** end SETUP for function hash32AsDouble **/ 
            int[] fieldIds7 = new int[ 1 ] ;
            fieldIds7 [ 0 ] = 6;
            Object tmp8 = (incomingBuild).getValueAccessorById(IntVector.class, fieldIds7).getValueVector();
            if (tmp8 == null) {
                throw new SchemaChangeException("Failure while loading vector vv6 with id: TypedFieldId [fieldIds=[6], remainder=null].");
            }
            vv6 = ((IntVector) tmp8);
            /** start SETUP for function hash32AsDouble **/ 
            {
                 {}
            }
            /** end SETUP for function hash32AsDouble **/ 
            int[] fieldIds13 = new int[ 1 ] ;
            fieldIds13 [ 0 ] = 6;
            Object tmp14 = (incomingProbe).getValueAccessorById(IntVector.class, fieldIds13).getValueVector();
            if (tmp14 == null) {
                throw new SchemaChangeException("Failure while loading vector vv12 with id: TypedFieldId [fieldIds=[6], remainder=null].");
            }
            vv12 = ((IntVector) tmp14);
            /** start SETUP for function hash32AsDouble **/ 
            {
                 {}
            }
            /** end SETUP for function hash32AsDouble **/ 
            int[] fieldIds19 = new int[ 1 ] ;
            fieldIds19 [ 0 ] = 1;
            Object tmp20 = (incomingProbe).getValueAccessorById(IntVector.class, fieldIds19).getValueVector();
            if (tmp20 == null) {
                throw new SchemaChangeException("Failure while loading vector vv18 with id: TypedFieldId [fieldIds=[1], remainder=null].");
            }
            vv18 = ((IntVector) tmp20);
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

    public int getHashProbe(int incomingRowIdx, int seedValue)
        throws SchemaChangeException
    {
        {
            IntHolder out15 = new IntHolder();
            {
                out15 .value = vv12 .getAccessor().get((incomingRowIdx));
            }
            IntHolder seedValue16 = new IntHolder();
            seedValue16 .value = seedValue;
            //---- start of eval portion of hash32AsDouble function. ----//
            IntHolder out17 = new IntHolder();
            {
                final IntHolder out = new IntHolder();
                IntHolder in = out15;
                IntHolder seed = seedValue16;
                 
Hash32WithSeedAsDouble$IntHash_eval: {
    out.value = org.apache.drill.exec.expr.fn.impl.HashHelper.hash32((double) in.value, seed.value);
}
 
                out17 = out;
            }
            //---- end of eval portion of hash32AsDouble function. ----//
            seedValue = out17 .value;
            IntHolder out21 = new IntHolder();
            {
                out21 .value = vv18 .getAccessor().get((incomingRowIdx));
            }
            IntHolder seedValue22 = new IntHolder();
            seedValue22 .value = seedValue;
            //---- start of eval portion of hash32AsDouble function. ----//
            IntHolder out23 = new IntHolder();
            {
                final IntHolder out = new IntHolder();
                IntHolder in = out21;
                IntHolder seed = seedValue22;
                 
Hash32WithSeedAsDouble$IntHash_eval: {
    out.value = org.apache.drill.exec.expr.fn.impl.HashHelper.hash32((double) in.value, seed.value);
}
 
                out23 = out;
            }
            //---- end of eval portion of hash32AsDouble function. ----//
            seedValue = out23 .value;
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
        IntVector vv27;
        IntVector vv31;
        IntVector vv36;
        IntVector vv40;
        IntVector vv43;
        IntVector vv47;

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

        public boolean isKeyMatchInternalProbe(int incomingRowIdx, int htRowIdx)
            throws SchemaChangeException
        {
            {
                IntHolder out21 = new IntHolder();
                {
                    out21 .value = vv18 .getAccessor().get((incomingRowIdx));
                }
                IntHolder out25 = new IntHolder();
                {
                    out25 .value = vv22 .getAccessor().get((htRowIdx));
                }
                //---- start of eval portion of compare_to_nulls_high function. ----//
                IntHolder out26 = new IntHolder();
                {
                    final IntHolder out = new IntHolder();
                    IntHolder left = out21;
                    IntHolder right = out25;
                     
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
 
                    out26 = out;
                }
                //---- end of eval portion of compare_to_nulls_high function. ----//
                if (out26 .value!= 0) {
                    return false;
                }
                IntHolder out30 = new IntHolder();
                {
                    out30 .value = vv27 .getAccessor().get((incomingRowIdx));
                }
                IntHolder out34 = new IntHolder();
                {
                    out34 .value = vv31 .getAccessor().get((htRowIdx));
                }
                //---- start of eval portion of compare_to_nulls_high function. ----//
                IntHolder out35 = new IntHolder();
                {
                    final IntHolder out = new IntHolder();
                    IntHolder left = out30;
                    IntHolder right = out34;
                     
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
 
                    out35 = out;
                }
                //---- end of eval portion of compare_to_nulls_high function. ----//
                if (out35 .value!= 0) {
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
                IntHolder out39 = new IntHolder();
                {
                    out39 .value = vv36 .getAccessor().get((incomingRowIdx));
                }
                vv40 .getMutator().setSafe((htRowIdx), out39 .value);
                IntHolder out46 = new IntHolder();
                {
                    out46 .value = vv43 .getAccessor().get((incomingRowIdx));
                }
                vv47 .getMutator().setSafe((htRowIdx), out46 .value);
            }
        }

        public void setupInterior(VectorContainer incomingBuild, RecordBatch incomingProbe, RecordBatch outgoing, VectorContainer htContainer)
            throws SchemaChangeException
        {
            {
                int[] fieldIds1 = new int[ 1 ] ;
                fieldIds1 [ 0 ] = 5;
                Object tmp2 = (incomingBuild).getValueAccessorById(IntVector.class, fieldIds1).getValueVector();
                if (tmp2 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv0 with id: TypedFieldId [fieldIds=[5], remainder=null].");
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
                fieldIds10 [ 0 ] = 6;
                Object tmp11 = (incomingBuild).getValueAccessorById(IntVector.class, fieldIds10).getValueVector();
                if (tmp11 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv9 with id: TypedFieldId [fieldIds=[6], remainder=null].");
                }
                vv9 = ((IntVector) tmp11);
                int[] fieldIds14 = new int[ 1 ] ;
                fieldIds14 [ 0 ] = 1;
                Object tmp15 = (htContainer).getValueAccessorById(IntVector.class, fieldIds14).getValueVector();
                if (tmp15 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv13 with id: TypedFieldId [fieldIds=[1], remainder=null].");
                }
                vv13 = ((IntVector) tmp15);
                /** start SETUP for function compare_to_nulls_high **/ 
                {
                     {}
                }
                /** end SETUP for function compare_to_nulls_high **/ 
                int[] fieldIds19 = new int[ 1 ] ;
                fieldIds19 [ 0 ] = 6;
                Object tmp20 = (incomingProbe).getValueAccessorById(IntVector.class, fieldIds19).getValueVector();
                if (tmp20 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv18 with id: TypedFieldId [fieldIds=[6], remainder=null].");
                }
                vv18 = ((IntVector) tmp20);
                int[] fieldIds23 = new int[ 1 ] ;
                fieldIds23 [ 0 ] = 0;
                Object tmp24 = (htContainer).getValueAccessorById(IntVector.class, fieldIds23).getValueVector();
                if (tmp24 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv22 with id: TypedFieldId [fieldIds=[0], remainder=null].");
                }
                vv22 = ((IntVector) tmp24);
                /** start SETUP for function compare_to_nulls_high **/ 
                {
                     {}
                }
                /** end SETUP for function compare_to_nulls_high **/ 
                int[] fieldIds28 = new int[ 1 ] ;
                fieldIds28 [ 0 ] = 1;
                Object tmp29 = (incomingProbe).getValueAccessorById(IntVector.class, fieldIds28).getValueVector();
                if (tmp29 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv27 with id: TypedFieldId [fieldIds=[1], remainder=null].");
                }
                vv27 = ((IntVector) tmp29);
                int[] fieldIds32 = new int[ 1 ] ;
                fieldIds32 [ 0 ] = 1;
                Object tmp33 = (htContainer).getValueAccessorById(IntVector.class, fieldIds32).getValueVector();
                if (tmp33 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv31 with id: TypedFieldId [fieldIds=[1], remainder=null].");
                }
                vv31 = ((IntVector) tmp33);
                /** start SETUP for function compare_to_nulls_high **/ 
                {
                     {}
                }
                /** end SETUP for function compare_to_nulls_high **/ 
                int[] fieldIds37 = new int[ 1 ] ;
                fieldIds37 [ 0 ] = 5;
                Object tmp38 = (incomingBuild).getValueAccessorById(IntVector.class, fieldIds37).getValueVector();
                if (tmp38 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv36 with id: TypedFieldId [fieldIds=[5], remainder=null].");
                }
                vv36 = ((IntVector) tmp38);
                int[] fieldIds41 = new int[ 1 ] ;
                fieldIds41 [ 0 ] = 0;
                Object tmp42 = (htContainer).getValueAccessorById(IntVector.class, fieldIds41).getValueVector();
                if (tmp42 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv40 with id: TypedFieldId [fieldIds=[0], remainder=null].");
                }
                vv40 = ((IntVector) tmp42);
                int[] fieldIds44 = new int[ 1 ] ;
                fieldIds44 [ 0 ] = 6;
                Object tmp45 = (incomingBuild).getValueAccessorById(IntVector.class, fieldIds44).getValueVector();
                if (tmp45 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv43 with id: TypedFieldId [fieldIds=[6], remainder=null].");
                }
                vv43 = ((IntVector) tmp45);
                int[] fieldIds48 = new int[ 1 ] ;
                fieldIds48 [ 0 ] = 1;
                Object tmp49 = (htContainer).getValueAccessorById(IntVector.class, fieldIds48).getValueVector();
                if (tmp49 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv47 with id: TypedFieldId [fieldIds=[1], remainder=null].");
                }
                vv47 = ((IntVector) tmp49);
            }
        }

        public void __DRILL_INIT__()
            throws SchemaChangeException
        {
        }

    }

}
