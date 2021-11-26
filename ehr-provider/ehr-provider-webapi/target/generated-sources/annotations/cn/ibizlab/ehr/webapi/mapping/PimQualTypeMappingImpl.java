package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimQualType;
import cn.ibizlab.ehr.webapi.dto.PimQualTypeDTO;
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
    date = "2021-09-04T00:31:49+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimQualTypeMappingImpl implements PimQualTypeMapping {

    @Override
    public PimQualType toDomain(PimQualTypeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimQualType pimQualType = new PimQualType();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimQualType.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimQualType.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSeialno() != null ) {
            pimQualType.setSeialno( dto.getSeialno() );
        }
        if ( dto.getPimqualtypename() != null ) {
            pimQualType.setPimqualtypename( dto.getPimqualtypename() );
        }
        if ( dto.getEnable() != null ) {
            pimQualType.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            pimQualType.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimQualType.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pimQualType.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPimqualtypeid() != null ) {
            pimQualType.setPimqualtypeid( dto.getPimqualtypeid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimQualType.setCreatedate( dto.getCreatedate() );
        }

        return pimQualType;
    }

    @Override
    public PimQualTypeDTO toDto(PimQualType entity) {
        if ( entity == null ) {
            return null;
        }

        PimQualTypeDTO pimQualTypeDTO = new PimQualTypeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimQualTypeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimQualTypeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSeialno() != null ) {
            pimQualTypeDTO.setSeialno( entity.getSeialno() );
        }
        if ( entity.getPimqualtypename() != null ) {
            pimQualTypeDTO.setPimqualtypename( entity.getPimqualtypename() );
        }
        if ( entity.getEnable() != null ) {
            pimQualTypeDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            pimQualTypeDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimQualTypeDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pimQualTypeDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPimqualtypeid() != null ) {
            pimQualTypeDTO.setPimqualtypeid( entity.getPimqualtypeid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimQualTypeDTO.setCreatedate( entity.getCreatedate() );
        }

        return pimQualTypeDTO;
    }

    @Override
    public List<PimQualType> toDomain(List<PimQualTypeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimQualType> list = new ArrayList<PimQualType>( dtoList.size() );
        for ( PimQualTypeDTO pimQualTypeDTO : dtoList ) {
            list.add( toDomain( pimQualTypeDTO ) );
        }

        return list;
    }

    @Override
    public List<PimQualTypeDTO> toDto(List<PimQualType> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimQualTypeDTO> list = new ArrayList<PimQualTypeDTO>( entityList.size() );
        for ( PimQualType pimQualType : entityList ) {
            list.add( toDto( pimQualType ) );
        }

        return list;
    }
}
