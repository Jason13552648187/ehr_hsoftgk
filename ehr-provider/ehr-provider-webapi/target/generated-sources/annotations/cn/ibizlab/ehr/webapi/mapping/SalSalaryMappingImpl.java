package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalSalary;
import cn.ibizlab.ehr.webapi.dto.SalSalaryDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SalSalaryMappingImpl implements SalSalaryMapping {

    @Override
    public SalSalary toDomain(SalSalaryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalSalary salSalary = new SalSalary();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salSalary.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salSalary.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getMemo() != null ) {
            salSalary.setMemo( dto.getMemo() );
        }
        if ( dto.getState() != null ) {
            salSalary.setState( dto.getState() );
        }
        if ( dto.getXc() != null ) {
            salSalary.setXc( dto.getXc() );
        }
        if ( dto.getSalsalaryname() != null ) {
            salSalary.setSalsalaryname( dto.getSalsalaryname() );
        }
        if ( dto.getOrmorgid() != null ) {
            salSalary.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimpersonid() != null ) {
            salSalary.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getSalsalarybillid() != null ) {
            salSalary.setSalsalarybillid( dto.getSalsalarybillid() );
        }
        if ( dto.getOrmdutyid() != null ) {
            salSalary.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            salSalary.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmpostid() != null ) {
            salSalary.setOrmpostid( dto.getOrmpostid() );
        }
        if ( dto.getSalplanid() != null ) {
            salSalary.setSalplanid( dto.getSalplanid() );
        }
        if ( dto.getSalsalaryid() != null ) {
            salSalary.setSalsalaryid( dto.getSalsalaryid() );
        }
        if ( dto.getOrgid() != null ) {
            salSalary.setOrgid( dto.getOrgid() );
        }
        if ( dto.getEnable() != null ) {
            salSalary.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            salSalary.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            salSalary.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            salSalary.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrgsectorid() != null ) {
            salSalary.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getUpdateman() != null ) {
            salSalary.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getSalsalarybillname() != null ) {
            salSalary.setSalsalarybillname( dto.getSalsalarybillname() );
        }
        if ( dto.getOrmpostname() != null ) {
            salSalary.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getNyear() != null ) {
            salSalary.setNyear( dto.getNyear() );
        }
        if ( dto.getOrmorgname() != null ) {
            salSalary.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getNmonth() != null ) {
            salSalary.setNmonth( dto.getNmonth() );
        }
        if ( dto.getOrmdutyname() != null ) {
            salSalary.setOrmdutyname( dto.getOrmdutyname() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            salSalary.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getPimpersonname() != null ) {
            salSalary.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getSalplanname() != null ) {
            salSalary.setSalplanname( dto.getSalplanname() );
        }

        return salSalary;
    }

    @Override
    public SalSalaryDTO toDto(SalSalary entity) {
        if ( entity == null ) {
            return null;
        }

        SalSalaryDTO salSalaryDTO = new SalSalaryDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salSalaryDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salSalaryDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getMemo() != null ) {
            salSalaryDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getState() != null ) {
            salSalaryDTO.setState( entity.getState() );
        }
        if ( entity.getXc() != null ) {
            salSalaryDTO.setXc( entity.getXc() );
        }
        if ( entity.getSalsalaryname() != null ) {
            salSalaryDTO.setSalsalaryname( entity.getSalsalaryname() );
        }
        if ( entity.getOrmorgid() != null ) {
            salSalaryDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimpersonid() != null ) {
            salSalaryDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getSalsalarybillid() != null ) {
            salSalaryDTO.setSalsalarybillid( entity.getSalsalarybillid() );
        }
        if ( entity.getOrmdutyid() != null ) {
            salSalaryDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            salSalaryDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmpostid() != null ) {
            salSalaryDTO.setOrmpostid( entity.getOrmpostid() );
        }
        if ( entity.getSalplanid() != null ) {
            salSalaryDTO.setSalplanid( entity.getSalplanid() );
        }
        if ( entity.getSalsalaryid() != null ) {
            salSalaryDTO.setSalsalaryid( entity.getSalsalaryid() );
        }
        if ( entity.getOrgid() != null ) {
            salSalaryDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getEnable() != null ) {
            salSalaryDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            salSalaryDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            salSalaryDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            salSalaryDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrgsectorid() != null ) {
            salSalaryDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getUpdateman() != null ) {
            salSalaryDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getSalsalarybillname() != null ) {
            salSalaryDTO.setSalsalarybillname( entity.getSalsalarybillname() );
        }
        if ( entity.getOrmpostname() != null ) {
            salSalaryDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getNyear() != null ) {
            salSalaryDTO.setNyear( entity.getNyear() );
        }
        if ( entity.getOrmorgname() != null ) {
            salSalaryDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getNmonth() != null ) {
            salSalaryDTO.setNmonth( entity.getNmonth() );
        }
        if ( entity.getOrmdutyname() != null ) {
            salSalaryDTO.setOrmdutyname( entity.getOrmdutyname() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            salSalaryDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getPimpersonname() != null ) {
            salSalaryDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getSalplanname() != null ) {
            salSalaryDTO.setSalplanname( entity.getSalplanname() );
        }

        return salSalaryDTO;
    }

    @Override
    public List<SalSalary> toDomain(List<SalSalaryDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalSalary> list = new ArrayList<SalSalary>( dtoList.size() );
        for ( SalSalaryDTO salSalaryDTO : dtoList ) {
            list.add( toDomain( salSalaryDTO ) );
        }

        return list;
    }

    @Override
    public List<SalSalaryDTO> toDto(List<SalSalary> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalSalaryDTO> list = new ArrayList<SalSalaryDTO>( entityList.size() );
        for ( SalSalary salSalary : entityList ) {
            list.add( toDto( salSalary ) );
        }

        return list;
    }
}
