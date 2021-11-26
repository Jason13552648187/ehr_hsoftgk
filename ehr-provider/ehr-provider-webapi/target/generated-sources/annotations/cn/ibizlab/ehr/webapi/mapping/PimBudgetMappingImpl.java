package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimBudget;
import cn.ibizlab.ehr.webapi.dto.PimBudgetDTO;
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
public class PimBudgetMappingImpl implements PimBudgetMapping {

    @Override
    public PimBudget toDomain(PimBudgetDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimBudget pimBudget = new PimBudget();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimBudget.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimBudget.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getBudget() != null ) {
            pimBudget.setBudget( dto.getBudget() );
        }
        if ( dto.getYear() != null ) {
            pimBudget.setYear( dto.getYear() );
        }
        if ( dto.getBudgetname() != null ) {
            pimBudget.setBudgetname( dto.getBudgetname() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimBudget.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimBudget.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimBudget.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimBudget.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimBudget.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pimBudget.setCreateman( dto.getCreateman() );
        }
        if ( dto.getBudgetid() != null ) {
            pimBudget.setBudgetid( dto.getBudgetid() );
        }
        if ( dto.getEnable() != null ) {
            pimBudget.setEnable( dto.getEnable() );
        }

        return pimBudget;
    }

    @Override
    public PimBudgetDTO toDto(PimBudget entity) {
        if ( entity == null ) {
            return null;
        }

        PimBudgetDTO pimBudgetDTO = new PimBudgetDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimBudgetDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimBudgetDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getBudget() != null ) {
            pimBudgetDTO.setBudget( entity.getBudget() );
        }
        if ( entity.getYear() != null ) {
            pimBudgetDTO.setYear( entity.getYear() );
        }
        if ( entity.getBudgetname() != null ) {
            pimBudgetDTO.setBudgetname( entity.getBudgetname() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimBudgetDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimBudgetDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimBudgetDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimBudgetDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimBudgetDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pimBudgetDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getBudgetid() != null ) {
            pimBudgetDTO.setBudgetid( entity.getBudgetid() );
        }
        if ( entity.getEnable() != null ) {
            pimBudgetDTO.setEnable( entity.getEnable() );
        }

        return pimBudgetDTO;
    }

    @Override
    public List<PimBudget> toDomain(List<PimBudgetDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimBudget> list = new ArrayList<PimBudget>( dtoList.size() );
        for ( PimBudgetDTO pimBudgetDTO : dtoList ) {
            list.add( toDomain( pimBudgetDTO ) );
        }

        return list;
    }

    @Override
    public List<PimBudgetDTO> toDto(List<PimBudget> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimBudgetDTO> list = new ArrayList<PimBudgetDTO>( entityList.size() );
        for ( PimBudget pimBudget : entityList ) {
            list.add( toDto( pimBudget ) );
        }

        return list;
    }
}
