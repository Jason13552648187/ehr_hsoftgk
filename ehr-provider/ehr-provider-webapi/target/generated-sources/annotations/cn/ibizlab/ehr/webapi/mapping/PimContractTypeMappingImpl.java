package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimContractType;
import cn.ibizlab.ehr.webapi.dto.PimContractTypeDTO;
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
    date = "2021-09-04T00:31:50+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimContractTypeMappingImpl implements PimContractTypeMapping {

    @Override
    public PimContractType toDomain(PimContractTypeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimContractType pimContractType = new PimContractType();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimContractType.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimContractType.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getLx() != null ) {
            pimContractType.setLx( dto.getLx() );
        }
        if ( dto.getSbm() != null ) {
            pimContractType.setSbm( dto.getSbm() );
        }
        if ( dto.getPimcontracttypename() != null ) {
            pimContractType.setPimcontracttypename( dto.getPimcontracttypename() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimContractType.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimContractType.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimContractType.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimContractType.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            pimContractType.setEnable( dto.getEnable() );
        }
        if ( dto.getPimcontracttypeid() != null ) {
            pimContractType.setPimcontracttypeid( dto.getPimcontracttypeid() );
        }
        if ( dto.getCreateman() != null ) {
            pimContractType.setCreateman( dto.getCreateman() );
        }

        return pimContractType;
    }

    @Override
    public PimContractTypeDTO toDto(PimContractType entity) {
        if ( entity == null ) {
            return null;
        }

        PimContractTypeDTO pimContractTypeDTO = new PimContractTypeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimContractTypeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimContractTypeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getLx() != null ) {
            pimContractTypeDTO.setLx( entity.getLx() );
        }
        if ( entity.getSbm() != null ) {
            pimContractTypeDTO.setSbm( entity.getSbm() );
        }
        if ( entity.getPimcontracttypename() != null ) {
            pimContractTypeDTO.setPimcontracttypename( entity.getPimcontracttypename() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimContractTypeDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimContractTypeDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimContractTypeDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimContractTypeDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            pimContractTypeDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getPimcontracttypeid() != null ) {
            pimContractTypeDTO.setPimcontracttypeid( entity.getPimcontracttypeid() );
        }
        if ( entity.getCreateman() != null ) {
            pimContractTypeDTO.setCreateman( entity.getCreateman() );
        }

        return pimContractTypeDTO;
    }

    @Override
    public List<PimContractType> toDomain(List<PimContractTypeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimContractType> list = new ArrayList<PimContractType>( dtoList.size() );
        for ( PimContractTypeDTO pimContractTypeDTO : dtoList ) {
            list.add( toDomain( pimContractTypeDTO ) );
        }

        return list;
    }

    @Override
    public List<PimContractTypeDTO> toDto(List<PimContractType> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimContractTypeDTO> list = new ArrayList<PimContractTypeDTO>( entityList.size() );
        for ( PimContractType pimContractType : entityList ) {
            list.add( toDto( pimContractType ) );
        }

        return list;
    }
}
