package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimTypeContract;
import cn.ibizlab.ehr.webapi.dto.PimTypeContractDTO;
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
    date = "2021-09-04T00:31:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimTypeContractMappingImpl implements PimTypeContractMapping {

    @Override
    public PimTypeContract toDomain(PimTypeContractDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimTypeContract pimTypeContract = new PimTypeContract();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimTypeContract.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimTypeContract.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getIsorno() != null ) {
            pimTypeContract.setIsorno( dto.getIsorno() );
        }
        if ( dto.getSortno() != null ) {
            pimTypeContract.setSortno( dto.getSortno() );
        }
        if ( dto.getContractlife() != null ) {
            pimTypeContract.setContractlife( dto.getContractlife() );
        }
        if ( dto.getTypecode() != null ) {
            pimTypeContract.setTypecode( dto.getTypecode() );
        }
        if ( dto.getPimtypecontractname() != null ) {
            pimTypeContract.setPimtypecontractname( dto.getPimtypecontractname() );
        }
        if ( dto.getUpdateman() != null ) {
            pimTypeContract.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimTypeContract.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            pimTypeContract.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPimtypecontractid() != null ) {
            pimTypeContract.setPimtypecontractid( dto.getPimtypecontractid() );
        }
        if ( dto.getCreateman() != null ) {
            pimTypeContract.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            pimTypeContract.setEnable( dto.getEnable() );
        }

        return pimTypeContract;
    }

    @Override
    public PimTypeContractDTO toDto(PimTypeContract entity) {
        if ( entity == null ) {
            return null;
        }

        PimTypeContractDTO pimTypeContractDTO = new PimTypeContractDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimTypeContractDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimTypeContractDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getIsorno() != null ) {
            pimTypeContractDTO.setIsorno( entity.getIsorno() );
        }
        if ( entity.getSortno() != null ) {
            pimTypeContractDTO.setSortno( entity.getSortno() );
        }
        if ( entity.getContractlife() != null ) {
            pimTypeContractDTO.setContractlife( entity.getContractlife() );
        }
        if ( entity.getTypecode() != null ) {
            pimTypeContractDTO.setTypecode( entity.getTypecode() );
        }
        if ( entity.getPimtypecontractname() != null ) {
            pimTypeContractDTO.setPimtypecontractname( entity.getPimtypecontractname() );
        }
        if ( entity.getUpdateman() != null ) {
            pimTypeContractDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimTypeContractDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            pimTypeContractDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPimtypecontractid() != null ) {
            pimTypeContractDTO.setPimtypecontractid( entity.getPimtypecontractid() );
        }
        if ( entity.getCreateman() != null ) {
            pimTypeContractDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            pimTypeContractDTO.setEnable( entity.getEnable() );
        }

        return pimTypeContractDTO;
    }

    @Override
    public List<PimTypeContract> toDomain(List<PimTypeContractDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimTypeContract> list = new ArrayList<PimTypeContract>( dtoList.size() );
        for ( PimTypeContractDTO pimTypeContractDTO : dtoList ) {
            list.add( toDomain( pimTypeContractDTO ) );
        }

        return list;
    }

    @Override
    public List<PimTypeContractDTO> toDto(List<PimTypeContract> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimTypeContractDTO> list = new ArrayList<PimTypeContractDTO>( entityList.size() );
        for ( PimTypeContract pimTypeContract : entityList ) {
            list.add( toDto( pimTypeContract ) );
        }

        return list;
    }
}
