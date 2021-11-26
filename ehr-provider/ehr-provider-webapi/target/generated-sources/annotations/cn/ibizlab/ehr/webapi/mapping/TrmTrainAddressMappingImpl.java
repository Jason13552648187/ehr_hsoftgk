package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainAddress;
import cn.ibizlab.ehr.webapi.dto.TrmTrainAddressDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrainAddressMappingImpl implements TrmTrainAddressMapping {

    @Override
    public TrmTrainAddress toDomain(TrmTrainAddressDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainAddress trmTrainAddress = new TrmTrainAddress();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainAddress.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainAddress.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getJs() != null ) {
            trmTrainAddress.setJs( dto.getJs() );
        }
        if ( dto.getPxlx() != null ) {
            trmTrainAddress.setPxlx( dto.getPxlx() );
        }
        if ( dto.getGxfw() != null ) {
            trmTrainAddress.setGxfw( dto.getGxfw() );
        }
        if ( dto.getEmail() != null ) {
            trmTrainAddress.setEmail( dto.getEmail() );
        }
        if ( dto.getDz() != null ) {
            trmTrainAddress.setDz( dto.getDz() );
        }
        if ( dto.getSfqy() != null ) {
            trmTrainAddress.setSfqy( dto.getSfqy() );
        }
        if ( dto.getHjzk() != null ) {
            trmTrainAddress.setHjzk( dto.getHjzk() );
        }
        if ( dto.getSf() != null ) {
            trmTrainAddress.setSf( dto.getSf() );
        }
        if ( dto.getLxr() != null ) {
            trmTrainAddress.setLxr( dto.getLxr() );
        }
        if ( dto.getSfkp() != null ) {
            trmTrainAddress.setSfkp( dto.getSfkp() );
        }
        if ( dto.getXz() != null ) {
            trmTrainAddress.setXz( dto.getXz() );
        }
        if ( dto.getXj() != null ) {
            trmTrainAddress.setXj( dto.getXj() );
        }
        if ( dto.getTrmtrainaddressname() != null ) {
            trmTrainAddress.setTrmtrainaddressname( dto.getTrmtrainaddressname() );
        }
        if ( dto.getLxdh() != null ) {
            trmTrainAddress.setLxdh( dto.getLxdh() );
        }
        if ( dto.getS() != null ) {
            trmTrainAddress.setS( dto.getS() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmTrainAddress.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainAddress.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getTrmtrainaddressid() != null ) {
            trmTrainAddress.setTrmtrainaddressid( dto.getTrmtrainaddressid() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainAddress.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainAddress.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainAddress.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainAddress.setEnable( dto.getEnable() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmTrainAddress.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getShortname() != null ) {
            trmTrainAddress.setShortname( dto.getShortname() );
        }

        return trmTrainAddress;
    }

    @Override
    public TrmTrainAddressDTO toDto(TrmTrainAddress entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainAddressDTO trmTrainAddressDTO = new TrmTrainAddressDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainAddressDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainAddressDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getJs() != null ) {
            trmTrainAddressDTO.setJs( entity.getJs() );
        }
        if ( entity.getPxlx() != null ) {
            trmTrainAddressDTO.setPxlx( entity.getPxlx() );
        }
        if ( entity.getGxfw() != null ) {
            trmTrainAddressDTO.setGxfw( entity.getGxfw() );
        }
        if ( entity.getEmail() != null ) {
            trmTrainAddressDTO.setEmail( entity.getEmail() );
        }
        if ( entity.getDz() != null ) {
            trmTrainAddressDTO.setDz( entity.getDz() );
        }
        if ( entity.getSfqy() != null ) {
            trmTrainAddressDTO.setSfqy( entity.getSfqy() );
        }
        if ( entity.getHjzk() != null ) {
            trmTrainAddressDTO.setHjzk( entity.getHjzk() );
        }
        if ( entity.getSf() != null ) {
            trmTrainAddressDTO.setSf( entity.getSf() );
        }
        if ( entity.getLxr() != null ) {
            trmTrainAddressDTO.setLxr( entity.getLxr() );
        }
        if ( entity.getSfkp() != null ) {
            trmTrainAddressDTO.setSfkp( entity.getSfkp() );
        }
        if ( entity.getXz() != null ) {
            trmTrainAddressDTO.setXz( entity.getXz() );
        }
        if ( entity.getXj() != null ) {
            trmTrainAddressDTO.setXj( entity.getXj() );
        }
        if ( entity.getTrmtrainaddressname() != null ) {
            trmTrainAddressDTO.setTrmtrainaddressname( entity.getTrmtrainaddressname() );
        }
        if ( entity.getLxdh() != null ) {
            trmTrainAddressDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getS() != null ) {
            trmTrainAddressDTO.setS( entity.getS() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmTrainAddressDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainAddressDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getTrmtrainaddressid() != null ) {
            trmTrainAddressDTO.setTrmtrainaddressid( entity.getTrmtrainaddressid() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainAddressDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainAddressDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainAddressDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainAddressDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmTrainAddressDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getShortname() != null ) {
            trmTrainAddressDTO.setShortname( entity.getShortname() );
        }

        return trmTrainAddressDTO;
    }

    @Override
    public List<TrmTrainAddress> toDomain(List<TrmTrainAddressDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainAddress> list = new ArrayList<TrmTrainAddress>( dtoList.size() );
        for ( TrmTrainAddressDTO trmTrainAddressDTO : dtoList ) {
            list.add( toDomain( trmTrainAddressDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainAddressDTO> toDto(List<TrmTrainAddress> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainAddressDTO> list = new ArrayList<TrmTrainAddressDTO>( entityList.size() );
        for ( TrmTrainAddress trmTrainAddress : entityList ) {
            list.add( toDto( trmTrainAddress ) );
        }

        return list;
    }
}
