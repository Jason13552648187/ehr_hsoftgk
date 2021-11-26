package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimSearchModal;
import cn.ibizlab.ehr.webapi.dto.PimSearchModalDTO;
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
public class PimSearchModalMappingImpl implements PimSearchModalMapping {

    @Override
    public PimSearchModal toDomain(PimSearchModalDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimSearchModal pimSearchModal = new PimSearchModal();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimSearchModal.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimSearchModal.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPimsearchmodalname() != null ) {
            pimSearchModal.setPimsearchmodalname( dto.getPimsearchmodalname() );
        }
        if ( dto.getSearchfields() != null ) {
            pimSearchModal.setSearchfields( dto.getSearchfields() );
        }
        if ( dto.getConditions() != null ) {
            pimSearchModal.setConditions( dto.getConditions() );
        }
        if ( dto.getContain() != null ) {
            pimSearchModal.setContain( dto.getContain() );
        }
        if ( dto.getIsquick() != null ) {
            pimSearchModal.setIsquick( dto.getIsquick() );
        }
        if ( dto.getCreateman() != null ) {
            pimSearchModal.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPimsearchmodalid() != null ) {
            pimSearchModal.setPimsearchmodalid( dto.getPimsearchmodalid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimSearchModal.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimSearchModal.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimSearchModal.setUpdatedate( dto.getUpdatedate() );
        }

        return pimSearchModal;
    }

    @Override
    public PimSearchModalDTO toDto(PimSearchModal entity) {
        if ( entity == null ) {
            return null;
        }

        PimSearchModalDTO pimSearchModalDTO = new PimSearchModalDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimSearchModalDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimSearchModalDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPimsearchmodalname() != null ) {
            pimSearchModalDTO.setPimsearchmodalname( entity.getPimsearchmodalname() );
        }
        if ( entity.getSearchfields() != null ) {
            pimSearchModalDTO.setSearchfields( entity.getSearchfields() );
        }
        if ( entity.getConditions() != null ) {
            pimSearchModalDTO.setConditions( entity.getConditions() );
        }
        if ( entity.getContain() != null ) {
            pimSearchModalDTO.setContain( entity.getContain() );
        }
        if ( entity.getIsquick() != null ) {
            pimSearchModalDTO.setIsquick( entity.getIsquick() );
        }
        if ( entity.getCreateman() != null ) {
            pimSearchModalDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPimsearchmodalid() != null ) {
            pimSearchModalDTO.setPimsearchmodalid( entity.getPimsearchmodalid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimSearchModalDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimSearchModalDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimSearchModalDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return pimSearchModalDTO;
    }

    @Override
    public List<PimSearchModal> toDomain(List<PimSearchModalDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimSearchModal> list = new ArrayList<PimSearchModal>( dtoList.size() );
        for ( PimSearchModalDTO pimSearchModalDTO : dtoList ) {
            list.add( toDomain( pimSearchModalDTO ) );
        }

        return list;
    }

    @Override
    public List<PimSearchModalDTO> toDto(List<PimSearchModal> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimSearchModalDTO> list = new ArrayList<PimSearchModalDTO>( entityList.size() );
        for ( PimSearchModal pimSearchModal : entityList ) {
            list.add( toDto( pimSearchModal ) );
        }

        return list;
    }
}
